import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivate {
    ChromeDriver chromeDriver= new ChromeDriver();

    @Test
    public  void dangKy(){
        chromeDriver.get("https://www.savor.vn/");
        chromeDriver.findElement(By.id("product-collection"));
    }
}
