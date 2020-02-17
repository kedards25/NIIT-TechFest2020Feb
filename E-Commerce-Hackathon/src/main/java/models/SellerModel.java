package models;

public class SellerModel {
	
	private int sellerId;
	private String sellerName;
	private String sellerPwd;
	public SellerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SellerModel(int sellerId, String sellerName, String sellerPwd) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerPwd = sellerPwd;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerPwd() {
		return sellerPwd;
	}
	public void setSellerPwd(String sellerPwd) {
		this.sellerPwd = sellerPwd;
	}
	@Override
	public String toString() {
		return "SellerModel [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerPwd=" + sellerPwd + "]";
	}

}
