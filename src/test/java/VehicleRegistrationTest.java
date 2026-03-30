/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.vrs.vehicleregistration.Finance;
import com.vrs.vehicleregistration.LoginSignUp;
import com.vrs.vehicleregistration.VehicleLicensing;
import com.vrs.vehicleregistration.VehicleRegistration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ganesh-kumar-r
 */
public class VehicleRegistrationTest {
    
    public VehicleRegistrationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testLoginSuccess() {
        LoginSignUp user = new LoginSignUp("Ganesh", "ganesh@vit.ac.in", "pass123");
        boolean result = user.login("ganesh@vit.ac.in", "pass123");
        assertTrue(result);
    }

    @Test
    public void testLoginFailure() {
        LoginSignUp user = new LoginSignUp("Ganesh", "ganesh@vit.ac.in", "pass123");
        boolean result = user.login("ganesh@vit.ac.in", "pass1234");
        assertFalse(result);
    }
    
    @Test
    public void testVehicleVerificationSuccess() {
        VehicleRegistration reg = new VehicleRegistration("TN07AB1234", "Ganesh");
        boolean result = reg.verifyDetails();
        assertTrue(result);
    }

    
    @Test
    public void testPoolingOfFunds() {
        Finance finance = new Finance(50000, "VRS_DB");
        finance.poolingOfFunds(10000);
        assertEquals(60000.0, finance.getBalance());
    }

    @Test
    public void testLicenseEligibility() {
        VehicleLicensing lic = new VehicleLicensing(21, "Ganesh", "Chennai");
        assertTrue(lic.age >= 18);
    }

    
}
