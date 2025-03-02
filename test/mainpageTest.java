/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Srinath.U
 */
public class mainpageTest {
    
    public mainpageTest() {
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

    /**
     * Test of main method, of class mainpage.
     */
    //@Test
   /* public void testMain() {
        System.out.println("main");
        String[] args = null;
        mainpage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
     public mainpage assignvalues(String number) {
        mainpage main = new mainpage();
        JTextField txt = new JTextField(number);
        main.setTxt1(txt);
        return main;
    }
     @Test
    public void testMain() {
        mainpage main = new mainpage();
        
        main = assignvalues("999");
        String expectedResult = "Invalid Mobile Number*";
        
        assertEquals(expectedResult, main.eventperformed());
    }
    @Test
    public void testID1() {
        mainpage main = new mainpage();
        
        main = assignvalues("999999");
        String expectedResult = "Invalid Mobile Number*";
        
        assertEquals(expectedResult, main.eventperformed());
    }

    @Test
    public void testID2() {
        mainpage main = new mainpage();
        
        main = assignvalues("999999");
        String expectedResult = "Invalid Mobile Number*";
        
        assertEquals(expectedResult, main.eventperformed());
    } 
}
