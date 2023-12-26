package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropDownTest extends BaseTest{
    @Test
    public void testSelectedOptions(){
       DropdownPage dropdownPage= homePage.clickDropdown();
       String option ="Option 1";
       dropdownPage.selectFromDropdown(option);
     List <String> selectedOption=dropdownPage.getSelectedOption();
        Assert.assertEquals(selectedOption.size(),
                1,"incorrect number of selected options");
        Assert.assertTrue(selectedOption.contains(option));

    }
}
