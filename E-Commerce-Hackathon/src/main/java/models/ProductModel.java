package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductModel {

	@Id
	private int productId;
	private String productName;
	private String productDescr;
	private double productPrice;
	
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", productDescr="
				+ productDescr + ", productPrice=" + productPrice + "]";
	}
	public ProductModel(int productId, String productName, String productDescr, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescr = productDescr;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescr() {
		return productDescr;
	}
	public void setProductDescr(String productDescr) {
		this.productDescr = productDescr;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
