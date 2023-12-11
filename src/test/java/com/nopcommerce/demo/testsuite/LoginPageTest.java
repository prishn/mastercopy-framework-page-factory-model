package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)

public class LoginPageTest extends BaseTest {
    //Declaration
    HomePage homePage;

    //Initialisation
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void test() {

    }

    @Test(groups = {"smoke", "regression"})
    public void test1() {

    }

    @Test(groups = {"regression"})
    public void test2() {

    }
}
