import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T00_testNG_intro_continue {
    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }

    @BeforeClass
    public void tearDown(){
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("After method is running");
    }

    @Test (priority = 2)
    public void test1(){
        System.out.println("TestNG test is running");
        String actual = "Loop";
        String expected = "Loop";
        Assert.assertEquals(actual, expected,actual+ " Is not matching with" + expected);
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("TestNG test 2 is running");
    }

}