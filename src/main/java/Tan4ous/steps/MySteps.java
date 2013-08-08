package Tan4ous.steps;

import Tan4ous.Point;
import org.jbehave.core.annotations.*;

import static org.junit.Assert.assertEquals;

public class MySteps {

    private String status;
    private Point point;
    int sum = 0, b1;

    @Given("b is <b>")
    public void givenAStockOfb(@Named("b") int b) {
        b1=b;

    }

    @When("sum of a or b")
    @Alias("sum of a or b")
    @Composite(steps = {"Given <user> is logged in", "Given bonus is <bonus>"})
    public void aCompositeStep(@Named("user") String user, @Named("bonus") int bonus) {
        sum = bonus + b1;
    }
    public void whenTheStockIsTradedAtsum(@Named("sum") Double sum) {
        status = point.checkOutSum(sum);
    }

    @Then("sum is <result>")
    public void thenTheAlertStatusShouldBeresult(@Named("result") String stat) {
        assertEquals(stat, status);
    }




}
