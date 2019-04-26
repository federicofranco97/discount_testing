package ar.edu.ub.testing.Discount.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.ub.testing.Discount.CDataManager;
import ar.edu.ub.testing.Discount.CDiscountEffectAmount;
import ar.edu.ub.testing.Discount.CDiscountInstance;
import ar.edu.ub.testing.Discount.CShoppingBasket;
import ar.edu.ub.testing.Discount.CShoppingBasketItem;

class CDiscountEffectAmountTest {

	
	
	private static final Object CDiscountInstance = null;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		discount = new   CDiscountEffectAmount(20.0f,1);		
	
		
	}

	@Test
	void testCDiscountEffectAmount() {
		
		assertEquals(discount.amount(),20.0f);
		assertEquals(discount.maxCount(),1);
		
		
	}
	
	@Test
	void testMaxCount() {
		
		assertNotNull(discount.maxCount());
		assertEquals(discount.maxCount(),null );
		assertNotEquals(discount.maxCount(),-1);
		
		
	}
	
	@Test
	void testAmount() {
		
		assertNotNull(discount.amount());
		assertNotSame(discount.amount(),null);
	}
	
	@Test
	void testApply() {
		
		assertNull(discount.apply(null , null));
		CShoppingBasket basket = null;
		CShoppingBasketItem item = null;
		assertNull(discount.apply(basket, item));
		
	}

	CDiscountEffectAmount discount ;
	
	
}
