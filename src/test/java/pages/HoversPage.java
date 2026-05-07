package pages;

import org.openqa.selenium.WebDriver;

public class HoversPage extends BasePage {

    private static final String AVATAR_PATTERN = "//h5[text()='name: user%s']//ancestor::div[@class='figure']";

    public HoversPage(WebDriver driver) {
        super(driver);
    }
}
