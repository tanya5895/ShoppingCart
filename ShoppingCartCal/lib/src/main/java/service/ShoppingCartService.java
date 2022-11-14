package service;

import java.util.HashMap;
import java.util.Map;

import model.Item;

public class ShoppingCartService {
	public static HashMap<String,Item> shoppingCart=new HashMap<>();
	
	public void addItem(String itemName,int qty,double unitPrice) {
		Item item =new Item(itemName,qty,getRoundOff(unitPrice));
		if(shoppingCart.containsKey(item.getItemName())) {
			int newQty=shoppingCart.get(item.getItemName()).getQty()+qty;
			item.setQty(newQty);
			shoppingCart.put(item.getItemName(),item);		
		}else {
			shoppingCart.put(itemName, item);
		}
		
	};
	
	public double calTotalPrice(double taxRate) {
		taxRate=getRoundOff(taxRate);
		double totalPrice=0;
		for(Map.Entry<String, Item> entry: shoppingCart.entrySet()) {
			totalPrice+=entry.getValue().getUnitPrice()*entry.getValue().getQty();
		}
//		System.out.println(totalPrice);
		totalPrice= totalPrice*(1+taxRate/100);
		return getRoundOff(totalPrice);
	};
	
	public void displayCart() {
		for(Map.Entry<String, Item> entry: shoppingCart.entrySet()) {
			System.out.println(entry.getKey()+" --> "+entry.getValue().toString());
		}
		
		
	}
	
	public double getRoundOff(double d) {
		double roundOff = Math.round(d * 100.0) / 100.0;
		return roundOff;
	}
	

}
