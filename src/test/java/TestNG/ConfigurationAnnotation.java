package TestNG;

import org.testng.annotations.*;

// press  ctrl+click on annotation to see all annotation in TestNG
public class ConfigurationAnnotation {
    // before annotation: set configuration before Starting test execution
// after annotation: clean up every thing after executing tests
    /* execution order : 1- before suit   2- before test
      3- before class    4- before method 5- test   6- after method
      7-  before method  8- test   9- after method   10 - after class
      11- after test 12- after suit
     */


    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("chrome setUp System property ");
    }
    @AfterSuite
    public void afterSuite()
    {   // run after all tests are run
        System.out.println("chrome clean up all cookies ");
    }

    @BeforeTest
    public void beforeTest()
    {   // run before a test start
        System.out.println("open chrome");
    }
    @AfterTest
    public void afterTest()
    {   // run after all test methods
        System.out.println("close chrome");
    }

    @BeforeClass
    public void beforeClass()
    {   // run before a test class start
        System.out.println("open test application");
    }
    @AfterClass
    public void afterClass()
    {   // run after all test methods run
        System.out.println("close test application");
    }
    @BeforeMethod
    public void beforeMethod()
    { //run before every test method
        System.out.println("sign in");
    }
    @Test
    public void searchCustomer(){
        System.out.println("search for customer");
    }
    @Test
    public void searchProduct(){
        System.out.println("search for product");

    }
    @AfterMethod
    public void afterMethod()
    { //run after every test method
        System.out.println("sign out");
    }
}
