package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _2_SecondTestCase {



    @Test
    public void thirdTestInTestNg(){
        System.out.println("third test");
    }

    @Test (groups = {"Smoke"})
    public void fourthTest(){
        System.out.println("fourth test");
    }
}
