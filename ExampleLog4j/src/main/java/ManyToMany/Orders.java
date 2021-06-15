package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNo;
	@Column
	private String menuName;
	
	@ManyToMany(mappedBy="order")			
	private List<Customer> customer;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderNo, String menuName, List<Customer> customer) {
		super();
		this.orderNo = orderNo;
		this.menuName = menuName;
		this.customer = customer;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
	
}
