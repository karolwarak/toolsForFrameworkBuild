import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _4_FourthTestCases {

    @Parameters({"URL"}) // take value of URL from xml file but
    // I have to run this test case (method) from testng3.xml file
    @Test(groups = {"Smoke"})
    public void WebLoginHomeLoan(String pageUrl){ // pass parameter to methods variable
        // selenium code
        System.out.println(pageUrl);
    }

    @Test(timeOut = 40000)
    // set specific time to wait until method will finished
    public void MobileLoginHomeLoan1(){
        System.out.println("Mobile login home ");


    }

    @Test
    public void MobileLoginHomeLoan2(){
        System.out.println("Mobile login home2 ");


    }

    @Test(enabled = false)
    // will skip this method during execution
    public void MobileLoginHomeLoan3(){
        System.out.println("Mobile login home3");


    }

    @Test(dependsOnMethods = {"WebLoginHomeLoan", "MobileLoginHomeLoan2"})
    // this method will execute after method WebLoginHomeLoan
    public void LoginApiHomeLoan(){
        // rest API automation
        System.out.println("API login home ");

    }
}
