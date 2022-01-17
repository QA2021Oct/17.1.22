import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver;
        driver = setUp();
        //test1(driver);
        //test2(driver);
        test3(driver);

    }
    public static WebDriver setUp(){
        // setting the property for the web driver:
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
        //creating new chrome driver:
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static void test1(WebDriver driver){
        driver.get("http://automationpractice.com/index.php");
        // driver.manage().window().maximize();
        //search by id:
        WebElement searchInput = driver.findElement((By.id("search_query_top")));
        searchInput.sendKeys("Dresses");
        // like press Enter:
        searchInput.submit();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")).click();
    }

    public static void test2(WebDriver driver){
        driver.get("https://www.youtube.com/");

    }

    public static void test3(WebDriver driver){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        driver.findElement(By.id("number1Field")).sendKeys("4");
        driver.findElement(By.id("number2Field")).sendKeys("8");

        driver.findElement(By.id("selectOperationDropdown"));
        driver.findElement(By.xpath("//option[contains(text(),'Subtract')]")).click();
        driver.findElement(By.id("calculateButton")).click();

        WebElement textBoxContentElement = driver.findElement(By.id("numberAnswerField"));
        String result = textBoxContentElement.getAttribute("value");
        System.out.println(result);

        if(result.equals("-4")){
            System.out.println("test has passed!");
        }
        else {
            System.out.println("Test has failed!");
        }
    }
}
