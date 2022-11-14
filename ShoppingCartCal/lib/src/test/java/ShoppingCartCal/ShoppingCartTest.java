/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ShoppingCartCal;

import org.junit.jupiter.api.Test;

import service.ShoppingCartService;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
	
	ShoppingCartService service=new ShoppingCartService();
	
    @Test 
    public void addItemTest() {
       service.addItem("Dove Soap", 2, 39.99);
       service.addItem("Dove Soap", 2, 39.99);
 	   service.addItem("Axe Deo", 2, 99.99);
 	   service.displayCart();
 	   assertEquals(service.shoppingCart.get("Dove Soap").getQty(),4);
 	   assertEquals(service.shoppingCart.size(),2);
    }
    
    @Test
    public void getTotal() {
       assertEquals(service.calTotalPrice(12.5),404.93);
    }
    
    @Test
    public void getRoundOffTest() {
       assertEquals(service.getRoundOff(34.9999),35.0);
    }
}