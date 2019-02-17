import org.testng.annotations.*;

public class _3_ThirdTestCases {

    @BeforeSuite
    public void beforeAllTestCases(){
        // this will execute before whole test cases are executed
        // I can configure here some global variables
        // for example environment details

        System.out.println("    I will execute before anything");
    }


    @BeforeTest
    public void prerequist(){
        // this will execute before (test folder) tag <test> which use test cases from that class (and only before that class)
        // I can do there e.g. clean up the data or delete some records from database
        // or base url can be in this section

        System.out.println("I will execute first");
    }

    @BeforeClass
    public void beforeThisClassExecution(){
        // will executed before all methods from this class
        // class level annotation
        System.out.println("I will be executed before this class");
    }

    @BeforeMethod
    public void beforeEveryTest(){
        // will executed before every method execution
        // class level annotation
        System.out.println("I will execute before every method in _3_ThirdTestCases class file ");
    }

    @Test(groups = {"Smoke"})
    public void WebLoginCarLoan(){
        // selenium code
        System.out.println("Web login car ");
    }

    @Test
    public void MobileLoginCarLoan(){
        System.out.println("Mobile login car ");
    }

    @Test
    public void LoginApiCarLoan(){
        // rest API automation
        System.out.println("API login car ");
    }

    @AfterMethod
    public void afterEveryTest(){
        // class level annotation

        System.out.println("I will execute after every method in _3_ThirdTestCases class file ");
    }

    @AfterClass
    public void afterThisClassExecution(){
        // will executed after all methods from this class
        // class level annotation
        System.out.println("I will be executed after this class");
    }

    @AfterTest
    public void lastExecution(){
        // it will execute after (test folder) tag </test> which use test cases from that class (and only after that class)
        // used for e.g. delete the cookies, stop the process or read the report

        System.out.println("I will execute last");
    }

    @AfterSuite
    public void afterAllTestCases(){
        // this will execute after all test cases are executed

        System.out.println("    I will execute definitely at the end");
    }

}
