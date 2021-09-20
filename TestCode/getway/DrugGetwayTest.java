/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getway;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Drug;
import model.Paginate;
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
public class DrugGetwayTest {
    DrugGetway drugGet;
    public DrugGetwayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        drugGet= new DrugGetway();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class DrugGetway.
     */
    /*@Test
    public void testSave() {
        System.out.println("save");
        Drug drug = new Drug(4,"Flagyl","Metronidazole","Antibiotic","2021-09-20");
        DrugGetway instance = drugGet;
        boolean expResult = true;
        boolean result = instance.save(drug);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of update method, of class DrugGetway.
     */
    /*@Test
    public void testUpdate() {
        System.out.println("update");
        Drug drug =new Drug(3,"Ace plus","Paracetamol","Painkiller(for headache)");
        DrugGetway instance = drugGet;
        boolean expResult = true;
        boolean result = instance.update(drug);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/


    /**
     * Test of delete method, of class DrugGetway.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 5;
        DrugGetway instance = drugGet;
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalDrug method, of class DrugGetway.
     */
    /*@Test
    public void testTotalDrug() {
        System.out.println("totalDrug");
        DrugGetway instance = drugGet;
        int expResult = 4;
        int result = instance.totalDrug();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of totalSearchDrug method, of class DrugGetway.
     */
    @Test
    public void testTotalSearchDrug() {
        System.out.println("totalSearchDrug");
        String query = "Paracetamol";
        DrugGetway instance = drugGet;
        int expResult = 2;
        int result = instance.totalSearchDrug(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
