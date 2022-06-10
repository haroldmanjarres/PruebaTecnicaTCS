package seleniumgluecode.TestMac;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestMac {

    private ChromeDriver driver;
    @Given("El usuario se encuentra en la pagina home de Store")
    public void El_usuario_se_encuentra_en_la_pagina_home_de_Store() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harol\\Videos\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/#");
        driver.manage().window().setSize(new Dimension(1390, 751));
    }
    @When("Hace click sobre el buttton Laptops de la pagina home de Store")
    public void Hace_click_sobre_el_buttton_Laptops_de_la_pagina_home_de_Store() {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("Hace click sobre el buttton MacBookPro de la pagina home de Store")
    public void Hace_click_sobre_el_buttton_MacBookPro_de_la_pagina_home_de_Store() {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @When("Hace click sobre el buttton Add to cart de la pagina home de Store")
    public void Hace_click_sobre_el_buttton_Add_to_cart_de_la_pagina_home_de_Store() {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Then("Muestra mensaje emergente que se realizo con exito")
    public void Muestra_mensaje_emergente_que_se_realizo_con_exito() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertThat(driver.switchTo().alert().getText(), is("Product added"));

        driver.quit();
    }

}
