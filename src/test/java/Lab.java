import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lab
{
    public static void main( String[] args )
    {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","src/main/java/com/mainacad/drivers/chromedriver ");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();

        //TODO: Вывести в консоль текст Инфо сообщения

        String textInfo = driver.findElement(By.cssSelector(".vc_message_box-standard")).getText();

        System.out.println(textInfo);

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")

        System.out.println(driver.findElement(By.cssSelector("legend > strong")).getText());

        //TODO: Кликнуть линк Partial Link Test

        driver.findElement(By.cssSelector("a[title='Automation Practice Form'] > strong")).click();

        //TODO: Заполнить поле First name:
        driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Max");

        //TODO: Заполнить поле Last name:
        driver.findElement(By.xpath("/html//input[@id='lastname']")).sendKeys("Skorokhod");

        //TODO: Выбрать пол
        driver.findElement(By.cssSelector("div:nth-of-type(14) > input:nth-of-type(1)")).click();

        //TODO: Выбрать количество лет опыта
        driver.findElement(By.cssSelector("div:nth-of-type(18) > input:nth-of-type(3)")).click();

        //TODO: Заполнить поле дата
        driver.findElement(By.xpath("//input[@id='datepicker'] ")).sendKeys("11-01-2199");

        driver.findElement(By.cssSelector("[for='profession-1']")).click();

        //TODO: Выбрать несколько Automation Tool

        driver.findElement(By.cssSelector("div:nth-of-type(29) > input:nth-of-type(2)")).click();

        driver.findElement(By.cssSelector("div:nth-of-type(29) > input:nth-of-type(3)")).click();

        //TODO: Выбрать континент из выпадающего списка

        driver.findElement(By.cssSelector("select#continents")).click();

        driver.findElement(By.cssSelector("select#continents > option[value='EU']")).click();

        //TODO: Выбрать несколько вариантов из списка Selenium Commands

        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[.='Navigation Commands']")).click();

        //TODO: Кликнуть на кнопку Button

        driver.findElement(By.id("submit")).click();

        //TODO: Закрыть браузер

        driver.quit();
    }
}
