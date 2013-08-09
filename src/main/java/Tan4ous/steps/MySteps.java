package Tan4ous.steps;

import org.jbehave.core.annotations.*;

import static junit.framework.Assert.assertEquals;


public class MySteps {
    int c;

    @Given("$d is d")
    public void isD(@Named("d") int d) {
        this.c += d;
    }

    @Given("$e is e")
    public void isE(@Named("e")  int e) {
        this.c += e;
    }

    @Given("Sum of %a or %b")
    @Alias("Sum of $a or $b")
    @Composite(steps = {
            "Given 10 is d",
            "Given 10 is e"
    })
    public void SumAandB(@Named("a") int a,@Named("b")  int b) {
        c = a + b;
    }

    @Then("Sum equal $sum")
    public void equalSum(int sum) {
        assertEquals(c, sum);
    }
}

