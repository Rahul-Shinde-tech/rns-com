package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	@Column
	private String customerName;
	@Column
	private int phoneNo;
	@ManyToMany
	@JoinTable(name="CustomerToOrder",
	joinColumns= {@JoinColumn(name="Customer_Id")},
	inverseJoinColumns= {@JoinColumn(name="Order_Id")})
	private List<Orders> order;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, int phoneNo, List<Orders> order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.order = order;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	
	
}
