package com.jixuan.story.steps;


import com.jixuan.tij.util.Range;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertFalse;

/**
 * @author jixuan
 *         Create on 15/3/25.
 */
public class GridSteps {
    private int num;
    private int[] arr;

    @Given("a int $num")
    public void aNum(int num) {
        this.num = num;
    }

    @When("get the num size int array")
    public void aArray() {
        this.arr = Range.range(num);
    }

    @Then("the numbers in array is between 0 to the num")
    public void checkNum() {
        boolean flag = true;
        for (int item : arr) {
            if (item >= num) {
                flag=false;
            }
        }
        assertFalse(flag);
    }
}
