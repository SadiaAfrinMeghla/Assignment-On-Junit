import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class Junit {

        WebDriver driver;

        @BeforeAll
        public void setup() {
            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


        }

//        @DisplayName("Get The Website ")
//        @Test
//        public void getTitle() {
//            driver.get("https://www.digitalunite.com/practice-webform-learners");
//            driver.manage().window().maximize();
//            String titleActule = driver.getTitle();
//            System.out.println(titleActule);
//            String titleExpected = "Practice Webform Learners";
//
//
//            Assertions.assertTrue(titleActule.contains("Practice Webform Learners"));
//            Assertions.assertEquals(titleExpected, titleActule);
//        }

        @Test
        public void fillUP() throws InterruptedException {

            driver.get("https://www.digitalunite.com/practice-webform-learners");
            driver.manage().window().maximize();
            Thread.sleep(1000);
            // Handle cookie consent popup
            try {
                driver.findElement(By.id("onetrust-accept-btn-handler")).click();  // This button might be for accepting cookies
                Thread.sleep(2000);  // Give it a moment to close the popup
            } catch (Exception e) {
                System.out.println("No cookie consent popup detected.");
            }

            driver.findElement(By.id("edit-name")).sendKeys("Sadia Afrin Meghla");
            driver.findElement(By.id("edit-number")).sendKeys("01751719925");
            driver.findElement(By.id("edit-date")).sendKeys("2000-09-03");
            driver.findElement(By.id("edit-email")).sendKeys("sadiameghlaa@gmail.com");
            driver.findElement(By.id("edit-tell-us-a-bit-about-yourself-")).sendKeys("Testing");
            Utils.scroll(driver, 500);
            Thread.sleep(6000);

            // File path
            String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\wp10468733-all-cats-wallpapers.jpg";
            File file = new File(filePath);

            // Check file size (must be less than 2MB)
            long fileSizeInBytes = file.length();
            long fileSizeInMB = fileSizeInBytes / (1024 * 1024); // Convert to MB

            Assertions.assertTrue(fileSizeInMB < 2, "File size is larger than 2MB");

            // Upload file if size is valid
            driver.findElement(By.id("edit-uploadocument-upload")).sendKeys(filePath);



            //driver.findElement(By.id("edit-uploadocument-upload")).sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\wp10468733-all-cats-wallpapers.jpg");
            driver.findElement(By.id("edit-age")).click();
            driver.findElement(By.id("edit-submit")).click();
            try {
                driver.switchTo().alert().accept(); // Accept the alert
            } catch (Exception e) {
                System.out.println("No alert detected.");



                 //Assert success message
                String successMessage = driver.findElement(By.cssSelector(".webform-confirmation")).getText();
                Assertions.assertTrue(successMessage.contains("Thank you for your submission!"));



            }


        }
    }



