/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getway;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.collections.ObservableList;
import model.Paginate;
import model.Patient;
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
public class PatientGetwayTest {
    PatientGetway patientGet;
    public PatientGetwayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()throws Exception {
        patientGet= new PatientGetway();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class PatientGetway.
     * @throws java.lang.Exception
     */
   /* @Test
    public void testSave()throws Exception {
        System.out.println("save");
        Patient patient = new Patient(11,"","Moumita",LocalDate.parse("1989-07-08", DateTimeFormatter.ISO_DATE), 2, "moumita@gmail.com", "01777777788", "Dhaka","2021-09-20");
        PatientGetway instance = patientGet;
        boolean expResult = true;
        boolean result = instance.save(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of update method, of class PatientGetway.
     */
    /*@Test
    public void testUpdate() {
        System.out.println("update");
        Patient patient = new Patient(10,null,"Mohammad Imrul",LocalDate.parse("1992-03-02", DateTimeFormatter.ISO_DATE), 1, "imrul@gmail.com", "01*******38", "Dhaka") ;
        PatientGetway instance = patientGet;
        boolean expResult = true;
        boolean result = instance.update(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of delete method, of class PatientGetway.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 10;
        PatientGetway instance = patientGet;
        boolean expResult = true;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalPatient method, of class PatientGetway.
     */
    /*@Test
    public void testTotalPatient() {
        System.out.println("totalPatient");
        PatientGetway instance =patientGet;
        int expResult = 11;
        int result = instance.totalPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of totalSearchPatient method, of class PatientGetway.
     */
    @Test
    public void testTotalSearchPatient() {
        System.out.println("totalSearchPatient");
        String query = "Ashadul";
        PatientGetway instance = patientGet;
        int expResult = 1;
        int result = instance.totalSearchPatient(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
