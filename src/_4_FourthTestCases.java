import org.testng.annotations.Test;

public class _4_FourthTestCases {

    @Test(groups = {"Smoke"})
    public void WebLoginHomeLoan(){
        // selenium code
        System.out.println("Web login home ");
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
