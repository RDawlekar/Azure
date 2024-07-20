package org.order;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class azureTest {

    @BeforeMethod
    public void beforeclass()
    {
System.out.println("before method");
    }
    @Test
    public void inclass()
    {
        System.out.println("in method");
    }
    @AfterMethod
    public void afterclass()
    {
        System.out.println("after method");
    }
}