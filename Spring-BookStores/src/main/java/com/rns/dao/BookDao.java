package com.rns.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.rns.beans.Book;

public class BookDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Book book) {
		String sql = "insert into Book(BookName,BookPrice,BookPublisher) values('" + book.getBookName() + "'," + book.getBookPrice() + ",'"
				+ book.getBookPublisher() + "')";
		return template.update(sql);
	}

	public int update(Book book) {
		String sql = "update Book set BookName='" + book.getBookName() + "', BookPrice=" + book.getBookPrice() + ",BookPublisher='"
				+ book.getBookPublisher() + "' where BookId=" + book.getBookId() + "";
		return template.update(sql);
	}

	public int delete(int bookId) {
		String sql = "delete from Book where bookid=" + bookId + "";
		return template.update(sql);
	}

	public Book getBookById(int id) {
		String sql = "select * from Book where bookId=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Book>(Book.class));
	}

	public List<Book> getBooks() {
		return template.query("select * from Book", new RowMapper<Book>() {
			public Book mapRow(ResultSet rs, int row) throws SQLException {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookPrice(rs.getFloat(3));
				book.setBookPublisher(rs.getString(4));
				return book;
			}
		});
	}
}
