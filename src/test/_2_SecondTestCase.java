package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _2_SecondTestCase {



    @Test
    public void firstTestInTestNg(){
        System.out.println("third test with testNG annotation");
    }

    @Test
    public void secondTest(){
        System.out.println("fourth test");
    }
}
