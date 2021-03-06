// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class ImagenTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void imagen() {
    driver.get("http://10.254.16.80/17042019-v2018/Portal/Home");
    driver.manage().window().setSize(new Dimension(1696, 1026));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
    vars.put("win1488", waitForWindow(2000));
    driver.switchTo().window(vars.get("win1488").toString());
    driver.findElement(By.cssSelector(".laptop--18:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".center")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.id("lnkSelIcone")).click();
    vars.put("win5622", waitForWindow(2000));
    driver.switchTo().window(vars.get("win5622").toString());
    driver.findElement(By.cssSelector(".icones__item:nth-child(3) .far")).click();
    driver.close();
    driver.switchTo().window(vars.get("win1488").toString());
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.id("lnkSelIcone")).click();
    vars.put("win7689", waitForWindow(2000));
    driver.switchTo().window(vars.get("win7689").toString());
    driver.findElement(By.cssSelector(".icones__item:nth-child(3) .far")).click();
    driver.close();
    driver.switchTo().window(vars.get("win1488").toString());
    {
      WebElement element = driver.findElement(By.linkText("Close"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.linkText("Close"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.linkText("Close"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.linkText("Close")).click();
  }
}
