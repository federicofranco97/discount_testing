
package ar.edu.ub.testing.Discount.tests;

import ar.edu.ub.testing.Discount.CDiscountConditionPayment;
import ar.edu.ub.testing.Discount.CPayment;
import ar.edu.ub.testing.Discount.CProductInstance;
import ar.edu.ub.testing.Discount.CShoppingBasket;
import ar.edu.ub.testing.Discount.CShoppingBasketItem;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestConditionPayment {
    
    public TestConditionPayment() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void createCondPay(){
        assertNotEquals(null,new CDiscountConditionPayment(new CPayment("pay1")));
    }
    
    @Test
    public void createNullCondPay(){
        assertEquals(null,new CDiscountConditionPayment(null));
    }
    
    @Test
    public void testMet()
    {
        CDiscountConditionPayment c = new CDiscountConditionPayment(new CPayment("psay"));
        assertEquals(true,c.met(new CShoppingBasket(), new CShoppingBasketItem(new CPayment("name"), new CProductInstance(null, 20), 0)));
    }
}
