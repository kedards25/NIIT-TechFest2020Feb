package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerModel {
	
	@Id
	private int customerId;
	private String customerName;
	private String customerPwd;
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerModel(int customerId, String customerName, String customerPwd) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPwd = customerPwd;
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
	public String getCustomerPwd() {
		return customerPwd;
	}
	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}
	@Override
	public String toString() {
		return "CustomerModel [customerId=" + customerId + ", customerName=" + customerName + ", customerPwd="
				+ customerPwd + "]";
	}
}
