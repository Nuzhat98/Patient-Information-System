/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getway;

import javafx.collections.ObservableList;
import model.Template;
import model.TemplateDrug;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class TemplateGetwayTest {
    TemplateGetway templateGet;
    public TemplateGetwayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        templateGet=new TemplateGetway();
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of total method, of class TemplateGetway.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        TemplateGetway instance =templateGet;
        int expResult = 4;
        int result = instance.total();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDrug method, of class TemplateGetway.
     */
    @Test
    public void testGetTotalDrug() {
        System.out.println("getTotalDrug");
        int templateId = 1;
        TemplateGetway instance = templateGet;
        int expResult = 1;
        int result = instance.getTotalDrug(templateId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
