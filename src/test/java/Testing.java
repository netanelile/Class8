import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Testing {
    //1. + 6.
    @Test
    public void openTowWebsitesWtihTowBrowsers(){
        System.setProperty("webdriver.chrome.driver", "/Users/nsananes/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.walla.co.il");

        System.setProperty("webdriver.gecko.driver", "/Users/nsananes/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ynet.co.il");
    }
    //2.
    @Test
    public void chromeGoogleTranslateTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/nsananes/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://translate.google.co.il/?hl=iw");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.className("er8xn")).sendKeys("Bla Bla");
        System.out.println(driver.findElement(By.className("er8xn")));

        WebElement enterText =  driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea\n"));

        enterText.clear();
        enterText.sendKeys("Blu Blu");

        System.out.println(enterText);
    }

    //3.
    @Test
    public void fireFoxYoutubeTest(){
        System.setProperty("webdriver.gecko.driver", "/Users/nsananes/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println(driver.findElement(By.id("logo-icon")));


    }

    //4. I couldn't find any Name locator for the search element. Also, none of the Class names worked.
    @Test
    public void fireFoxSeleniumTest(){
        System.setProperty("webdriver.gecko.driver", "/Users/nsananes/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumhq.org");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/header/nav/div/div/span/input")).sendKeys("selenium");
        System.out.println(driver.findElement(By.className("navbar-nav")));


    }

    //5.
    @Test
    public void chromeAmazonTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/nsananes/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather Shoos");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    //7.
    @Test
    public void fireFoxSearchYoutubeTest(){
        System.setProperty("webdriver.gecko.driver", "/Users/nsananes/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("search-form")).click();
        driver.findElement(By.name("search_query")).sendKeys("wallerman");
        driver.findElement(By.id("search-icon-legacy")).click();


    }

    //8.
    @Test
    public void chromeFaceBookTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/nsananes/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("UserName/Email");
        driver.findElement(By.id("pass")).sendKeys("Passsword*******");
        driver.findElement(By.name("login")).click();
    }

    //9.
    @Test
    public void chromeJavaScriptTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/nsananes/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.className("RNmpXc"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

    //10. Yes Selenium Grid, TestNG, & Junit

}
