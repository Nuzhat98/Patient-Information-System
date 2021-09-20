/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getway;

import javafx.collections.ObservableList;
import model.Paginate;
import model.Patient;
import model.Prescription;
import model.PrescriptionDrug;
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
public class PrescriptionGetwayTest {

    PrescriptionGetway prescriptionGet;

    public PrescriptionGetwayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        prescriptionGet = new PrescriptionGetway();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testTotalPrescription() {
        System.out.println("totalPrescription");
        PrescriptionGetway instance = prescriptionGet;
        int expResult = 4;
        int result = instance.totalPrescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalSearchPrescription method, of class PrescriptionGetway.
     */
    @Test
    public void testTotalSearchPrescription() {
        System.out.println("totalSearchPrescription");
        String query = "Mehrin";
        PrescriptionGetway instance = prescriptionGet;
        int expResult = 2;
        int result = instance.totalSearchPrescription(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
