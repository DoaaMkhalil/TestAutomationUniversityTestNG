package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdownList =By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFromDropdown(String option){
       findDropDownElement().selectByVisibleText(option);
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdownList));
    }

    public List<String> getSelectedOption(){
       List<WebElement>selectedElement= findDropDownElement().getAllSelectedOptions();
      return   selectedElement.stream().map(e->e.getText())
              .collect(Collectors.toList());
      // instead this we can loop in the list and getText for each webElement &
        // save it in list of string
    }}
