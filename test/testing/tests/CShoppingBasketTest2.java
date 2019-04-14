package testing.tests;

import ar.edu.ub.testing.Discount.CDataManager;
import ar.edu.ub.testing.Discount.CShoppingBasket;
import ar.edu.ub.testing.Discount.CShoppingBasketItem;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fede
 */
public class CShoppingBasketTest2 {
    
    public CShoppingBasketTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testData = new CTestData();
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void example(){
	
        CDataManager data = testData.manager("default");
		
		
        CShoppingBasket basket = new CShoppingBasket();
		
        basket.addItems(Arrays.asList(
			
                new CShoppingBasketItem(
					data.payment("Efectivo")
					, data.commerce("Coto").product("Melba")
					, 3)
			));
		
		basket.applyDiscount(data.discount("$5 en Melba"));

		assertEquals(66.0f, basket.total());
		assertEquals(15.0f, basket.totalDiscount());
		assertEquals(51.0f, basket.net());
	}

    
    
    private CTestData testData;

}
