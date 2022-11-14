package model;

public class Item {
	String itemName;
	int qty;
	double unitPrice;
	
	
	
	public Item(String itemName, int qty, double unitPrice) {
		super();
		this.itemName = itemName;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
	
	
	
	
}
