package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;


public class UserManagementSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to Admin Page")
    public void navigateToAdminPage() {
        ln.clickFunc(ln.adminpage);
    }

    @When("Click on the element in Dialog Content")
    public void clickOnTheElementInDialogContent(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.clickFunc(element);
        }

    }

    @Then("Notification message should be displayed")
    public void notificationMessageShouldBeDisplayed() {
        dc.verifyElement(dc.notificationMsg);
    }

    @When("Enter the password as {string} and confirm password as {string}")
    public void enterThePasswordAsAndConfirmPasswordAs(String password, String passwordConfirm) {
        dc.sendkeysFunc(dc.passwordAP, password);
        dc.sendkeysFunc(dc.conPasswordAP, passwordConfirm);
    }

    @When("Enter the password as {string}")
    public void enterThePasswordAs(String password) {
        dc.sendkeysFunc(dc.passwordAP, password);
    }

    @When("Enter the username as {string}")
    public void enterTheUsernameAs(String username) {
        dc.sendkeysFunc(dc.usernameInAP, username);
    }

    @Then("Add button should be displayed")
    public void addButtonShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.addButton, "Add");
    }

    @Then("All required elements should be displayed")
    public void allRequiredElementsShouldBeDisplayed() {
        dc.verifyElement(dc.userRole);
        dc.verifyElement(dc.employeeName);
        dc.verifyElement(dc.status);
        dc.verifyElement(dc.usernameInAP);
        dc.verifyElement(dc.passwordAP);
        dc.verifyElement(dc.conPasswordAP);
        dc.verifyElement(dc.cancelBtn);
        dc.verifyElement(dc.saveBtnInAP);

    }


    @Then("Add user heading should be displayed")
    public void addUserHeadingShouldBeDisplayed() {
        dc.verifyElement(dc.addUser);
    }

    @And("Enter an invalid name {string} to name field")
    public void enterAnInvalidNameToNameField(String username) {
        dc.sendkeysFunc(dc.employeeName, username);
        dc.clickFunc(dc.usernameInAP);
    }


    @And("Enter a value to username less than five character {string}")
    public void enterAValueToUsernameLessThanCharacter(String username) {
        dc.sendkeysFunc(dc.usernameInAP, username);

    }

    @Then("User from sending the keys in Dialog Content")
    public void userFromSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendkeysFunc(element, items.get(i).get(1));

        }
    }


    @Then("Robot {string}")
    public void robot(String haraket) throws AWTException {

        int sayi = Integer.parseInt(haraket);
        Robot rbt = new Robot();
        for (int i = 1; i <= sayi; i++) {
            rbt.keyPress(KeyEvent.VK_DOWN);
            rbt.keyRelease(KeyEvent.VK_DOWN);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
    }


    @Then("Saved User Control{string}")
    public void savedUserControl(String kul) {
        dc.verifyContainsTextFunction(dc.savedUsername, kul);

    }


    @When("Password Check")
    public void passwordCheck() {
        dc.verifyContainsTextFunction(dc.redtext, "Try a different password");
    }

    @And("Wait until element visible")
    public void waitUntilElementVisible(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.waitUntilVisible(element);
        }
    }
}
