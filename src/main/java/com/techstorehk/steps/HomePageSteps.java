package com.techstorehk.steps;

import com.techstorehk.pages.HeaderMenu;
import com.techstorehk.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSteps {

    HomePage homePage = new HomePage();
    HeaderMenu headerMenu = new HeaderMenu();

    @Then("^Verify user is on homepage$")
    public void verifyUserOnHomePage() {
        homePage.verifyHomePage();
    }

    @And("^Verify header menu tabs on homepage$")
    public void verifyHeaderMenuTabs() {
       headerMenu.verifyHeaderMenuTabs();
    }

    @And("^Verify header icon of the header menu")
    public void verifyHeaderMenuIcon() {
        headerMenu.verifyHeaderIcons();
    }
}
