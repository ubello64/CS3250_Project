public class DataEntry {
	// The backup class for a pseudo-database
	private String productId;
	private Integer quantity;
	private double wholesaleCost;
	private float salePrice;
	private final String supplierId;
	
	public DataEntry(
	 String productId,
	 Integer quantity,
	 double wholesaleCost,
	 float salePrice,
	 String supplierId
	) {
		this.productId = productId;
		this.quantity = quantity;
		this.wholesaleCost = wholesaleCost;
		this.salePrice = salePrice;
		this.supplierId = supplierId;
	}
	
	@Override public String toString() {
		return "" + productId
		 + quantity
		 + wholesaleCost
		 + salePrice
		 + supplierId + "\n";
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public  void setQUANTITY(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double getWholesaleCost() {
		return wholesaleCost;
	}
	
	public void setWholesaleCost(double wholesaleCost) {
		this.wholesaleCost = wholesaleCost;
	}
	
	public float getSalePrice() {
		return salePrice;
	}
	
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}
	
	public String getSupplierId() {
		return supplierId;
	}
	
	public void setSupplierId(String supplierId) {
		supplierId = supplierId;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	@Override public int hashCode() {
		return productId.hashCode();
	}
	
	@Override public boolean equals(Object obj) {
		if(obj instanceof DataEntry) {
			DataEntry de = (DataEntry)obj;
			return this.getProductId().equals(de.getProductId())
			 && this.getSalePrice() == de.getSalePrice()
			 && this.getQuantity() == de.getQuantity()
			 && this.getWholesaleCost() == de.getWholesaleCost()
			 && this.getSupplierId().equals(de.getSupplierId());
		}
		return false;
	}
}
