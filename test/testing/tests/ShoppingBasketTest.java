package testing.tests;

import ar.edu.ub.testing.Discount.CShoppingBasket;
import ar.edu.ub.testing.Discount.CShoppingBasketItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingBasketTest {
    
    public ShoppingBasketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        basket=null;
        bItem=null;
    }
    
    @After
    public void tearDown() {
    }

   
    /*
    Metodo que testea el constructor de ShopingBasket. Como no se pasan parametros,
    el constructor resuelve todo solo no hay mucho para testear.
    */
    @Test
    public void createBasket(){
         assertNotEquals(null,new CShoppingBasket());
    }
    
    /*
    Metodo que retorna la canasta de los items de la Basket. (No puede devolver null)
    */
    @Test
    public void getItemsCanasta(){
        assertNotEquals(null, basket.items());           
    }
    
    /*
    Metodo que retorna la canasta de los descuentos. (No puede ser nulo)
    */
    @Test
    public void getDiscounts(){
        assertNotEquals(null, basket.discounts());
    }
    
    /*
    Metodo que prueba agregar un item a la lista. Cambiaria a que retorne true
    si lo agrega exitosamente y que retorne false de lo contrario para poder testearlo.
    */
//    @Test
//    public void agregarItemValido(){
//        assertNotEquals(false, basket.addItem(bItem));
//    }
   
    
    
    
    private CShoppingBasket basket;
    private CShoppingBasketItem bItem;
}
