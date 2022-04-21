package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("^user should be logged in and should be present at its own wall$")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() throws Throwable{
        System.out.println("hello we are ok but fine");
    }

    @When("^I type the massage in the text box$")
    public void i_type_the_massage_in_the_text_box() throws Throwable {
        System.out.println("hello we are ok. Hopefully everything will work");
    }

    @Then("^the massage should get posted$")
    public void the_massage_should_get_posted() throws Throwable {
        System.out.println("hello we are feeling ok");
    }

    @And("^Click on post button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("hello we are not fine today");
    }

}

