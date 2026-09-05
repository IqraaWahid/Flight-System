/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i2wahid
 */
public class FlightTest {
    
    public FlightTest() {
        System.out.println("Testing constructor using valid arguments: ");
        Flight f = new Flight (2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        
        assertEquals(2131,f.getFlightNumber());
        assertEquals("Toronto", f.getOrigin());
        assertEquals("Lahore", f.getDestination());
        assertEquals("10/10/26 18:00", f.getDepartureTime());
        assertEquals(1000, f.getCapacity());
        assertEquals(500.00, f.getOriginalPrice(), 0.0001); //tolerance(delta) is 0.0001. Both can differ by 0.0001
    }
    
    @Test (expected=IllegalArgumentException.class)
    public void testIncorrectConstructor(){
        System.out.println("Testing constructor using invalid input");
        Flight f = new Flight (2131, "Toronto", "Toronto", "10/10/26 18:00", 1000, 500.00);
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
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setFlightNumber");     
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        int flightNumber = 1234;
        instance.setFlightNumber(flightNumber);
        assertEquals(flightNumber, instance.getFlightNumber());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getFlightNumber");
        int expResult = 2131;
        Flight instance = new Flight(expResult, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setOrigin");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        String origin = "Saudi Arabia";
        instance.setOrigin(origin);
        assertEquals(origin, instance.getOrigin());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getOrigin");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setDestination");
        String destination = "Saudi Arabia";
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        instance.setDestination(destination);
        assertEquals(destination,instance.getDestination());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getDestination");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        String expResult = "Lahore";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setDepartureTime");
        String departureTime = "12/12/12 12:12";
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        instance.setDepartureTime(departureTime);
        assertEquals(departureTime, instance.getDepartureTime());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
       // TODO review the generated test code and remove the default call to fail.
        System.out.println("getDepartureTime");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        String expResult = "10/10/26 18:00";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        // TODO review the generated test code and remove the default call to fail.
        int capacity = 2000;
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        instance.setCapacity(capacity);
        assertEquals(capacity, instance.getCapacity());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        // TODO review the generated test code and remove the default call to fail.
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        int expResult = 1000;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 2000;
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        assertEquals(numberOfSeatsLeft,instance.getNumberOfSeatsLeft());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        int expResult = 1000;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setOriginalPrice");
        double originalPrice = 123.21;
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        instance.setOriginalPrice(originalPrice);
        assertEquals(originalPrice,instance.getOriginalPrice(),0.0001);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        double expResult = 500.00;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0001);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookSeat method, of class Flight.
     */
    @Test
    public void testBookSeat() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("bookSeat");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        boolean expResult = true;
        boolean result = instance.bookSeat();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("toString");
        Flight instance = new Flight(2131, "Toronto", "Lahore", "10/10/26 18:00", 1000, 500.00);
        String expResult = ("Flight 2131, Toronto to Lahore, 10/10/26 18:00, Original Price:500.0");
        String result = instance.toString();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
}
