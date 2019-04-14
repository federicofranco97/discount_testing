/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.tests;

import ar.edu.ub.testing.Discount.CBrand;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fede
 */
public class CBrandTest {
    
    public CBrandTest() {
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

    /*
    Emplea el metodo name() que debe retornar el nombre de la CBrand que se asigna en el 
    constructor. No puede retornar null nunca, siempre un String correspondiente al nombre.
    */
    @Test
    public void getName(){
        CBrand myBrand=new CBrand("myBrand");
        assertNotEquals(null, myBrand.name());
    }
    
    /*
    Validacion del parametro que se envia al constructor al crear una nueva CBrand
    se tiene que poner un String como nombre de la CBrand. No debe permitirse poner null.
    */
    @Test
    public void createNullNameCBrand(){
        assertEquals(null, new CBrand(null));
    }
    
    /*
    Metodo que testea si funciona crear una instancia valida de la clase CBrand.
    new CBrand("Doritos") devuelve el objeto creado con ese nombre, por lo que si
    es null significa que la instancia no se pudo crear.
    */
    @Test
    public void createCBrand(){
        assertNotEquals(null,new CBrand("Doritos"));
    }
    
    /*
    Metodo que testee la creacion de una brand con un string sin contenido
    */
    @Test
    public void createEmptyBrand(){
        assertEquals(null,new CBrand(""));
    }
    
    /*
    Metodo que testee que la creacion de una brand no sean todos espacios en blanco
    */
    @Test
    public void createSpacingBrand(){
        assertEquals(null, new CBrand("   "));
    }
    
    
}

