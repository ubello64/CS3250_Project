public class DataEntry {
	// The backup class for a pseudo-database
	private static String PRODUCT_ID;
	private static Integer QUANTITY;
	private static double WHOLESALE_COST;
	private static float SALE_PRICE;
	private static String SUPPLIER_ID;
	
	public DataEntry(
	 String PRODUCT_ID,
	 Integer QUANTITY,
	 double WHOLESALE_COST,
	 float SALE_PRICE,
	 String SUPPLIER_ID
	) {
		DataEntry.PRODUCT_ID = PRODUCT_ID;
		DataEntry.QUANTITY = QUANTITY;
		DataEntry.WHOLESALE_COST = WHOLESALE_COST;
		DataEntry.SALE_PRICE = SALE_PRICE;
		DataEntry.SUPPLIER_ID = SUPPLIER_ID;
	}
	
	@Override public String toString() {
		return "" + PRODUCT_ID
		 + QUANTITY
		 + WHOLESALE_COST
		 + SALE_PRICE
		 + SUPPLIER_ID + "\n";
	}
	
	public static long getQuantity() {
		return QUANTITY;
	}
	
	public static void setQUANTITY(Integer QUANTITY) {
		DataEntry.QUANTITY = QUANTITY;
	}
	
	public static double getWholesaleCost() {
		return WHOLESALE_COST;
	}
	
	public static void setWholesaleCost(double wholesaleCost) {
		WHOLESALE_COST = wholesaleCost;
	}
	
	public static float getSalePrice() {
		return SALE_PRICE;
	}
	
	public static void setSalePrice(float salePrice) {
		SALE_PRICE = salePrice;
	}
	
	public static String getSupplierId() {
		return SUPPLIER_ID;
	}
	
	public static void setSupplierId(String supplierId) {
		SUPPLIER_ID = supplierId;
	}
	
	public static String getProductId() {
		return PRODUCT_ID;
	}
	
	public static void setProductId(String productId) {
		PRODUCT_ID = productId;
	}
	
	@Override public int hashCode() {
		return PRODUCT_ID.hashCode();
	}
	
	@Override public boolean equals(Object obj) {
		if(obj instanceof DataEntry) {
			DataEntry de = (DataEntry)obj;
			return getProductId().equals(PRODUCT_ID)
			 && getSalePrice() == SALE_PRICE
			 && getQuantity() == QUANTITY
			 && getWholesaleCost() == WHOLESALE_COST
			 && getSupplierId().equals(SUPPLIER_ID);
		}
		return false;
	}
}
