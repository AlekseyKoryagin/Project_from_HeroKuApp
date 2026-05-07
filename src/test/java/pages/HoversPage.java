package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends BasePage {
    Actions actions = new Actions(driver);

    private static final String AVATAR_PATTERN = "//h5[text()='name: user%s']//ancestor::div[@class='figure']";

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public HoversPage open() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        return this;
    }

    public void moveToElement(int user) {
        By avatar = By.xpath(AVATAR_PATTERN.formatted(user));
        actions.moveToElement(driver.findElement(avatar)).perform();
    }
}
