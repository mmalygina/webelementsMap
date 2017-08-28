
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.HashMap;
import java.util.Map;



public class menuItems {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void beforetest() {

        driver.manage().window().maximize();

        driver.get("whatever url this page is on");
    }

    @After
    public void aftertest() {
        driver.quit();

    }

    @Test
    public void findItemsOnMenu()throws Throwable{
        try {
            List<WebElement> foods = driver.findElements(By.className("title"));
            List<WebElement> foodsDesc = driver.findElements(By.className("description"));
            System.out.println("Third Element");
            System.out.println(foods.get(2).getText() + " ," + foodsDesc.get(2).getText());
            System.out.println("Fith Element");
            System.out.println(foods.get(4).getText() + " ," + foodsDesc.get(4).getText());
        }
        catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }
    }

    @Test
    public void mapQuestion(){

        List<WebElement> foods = driver.findElements(By.className("title"));
        List<WebElement> foodsDesc = driver.findElements(By.className("description"));

        Map<String, String> map = new HashMap<>();

        for(int i=0;i<foods.size();i++){
            map.put(foods.get(i).getText(),foodDesc.get(i).getText());
        }

        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


    }

}
