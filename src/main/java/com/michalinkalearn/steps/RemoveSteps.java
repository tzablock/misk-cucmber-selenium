package com.michalinkalearn.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RemoveSteps {
    WebDriver driver;

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","/home/tzablock/IdeaProjects/michalinkalearn/src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://demoshop.pagamastarde.com/oscommerce-2.3.4/");
    }

    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String arg1) throws Throwable {
        driver.navigate().to("http://demoshop.pagamastarde.com/oscommerce-2.3.4/advanced_search_result.php?keywords=Die+Hard&search_in_description=1&osCsid=dho35vjmnq3crrro0i6140n0n0&x=1&y=10");
    }

    @When("^choose to buy the first item$")
    public void choose_to_buy_the_first_item() throws Throwable {
        driver.navigate().to("http://demoshop.pagamastarde.com/oscommerce-2.3.4/product_info.php?products_id=12");
    }

    @When("^add item to cart$")
    public void add_item_to_cart() throws Throwable {
        WebElement e = driver.findElement(By.className("ui-button-text"));
        e.click();
    }

    @When("^remove it from cart$")
    public void remove_it_from_cart() throws Throwable {
        driver.navigate().to("http://demoshop.pagamastarde.com/oscommerce-2.3.4/shopping_cart.php?products_id=12&action=remove_product");
    }

}
