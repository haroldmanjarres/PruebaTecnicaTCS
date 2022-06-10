package seleniumgluecode.Testt;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Test {

    private ChromeDriver driver;
    @Given("El usuario se encuentra en la pagina home de Store")
    public void El_usuario_se_encuentra_en_la_pagina_home_de_Store() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harol\\Videos\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/#");
        driver.manage().window().setSize(new Dimension(1390, 751));
    }
    @When("Hace click sobre el buttton Sign up de la pagina home de Store")
    public void Hace_click_sobre_el_buttton_Sign_up_de_la_pagina_home_de_Store() {
        driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @When("Hace click en el campo de Username")
    public void Hace_click_en_el_campo_de_Username() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input")).click();

    }
    @When("Ingresa datos de usuario")
    public void Ingresa_datos_de_usuario() {
        Random rn        = new Random();
        int    range     = 9999999 - 1000000 + 1;
        int    randomNum =  rn.nextInt(range) + 1000000;
        Random rc = new Random();
        char   c  = (char)(rc.nextInt(26) + 'A');
        String str = randomNum+""+c;
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("Pruebaharold6" + str);
    }
    @When("Hace click en el campo de Password")
    public void Hace_click_en_el_campo_de_Password() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input")).click();
    }
    @When("Ingresa datos de Password")
    public void Ingresa_datos_de_Password() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("123");
    }
    @When("Hace click sobre el buttton Sign up")
    public void Hace_click_sobre_el_buttton_Sign_up() {
        driver.findElement(By.cssSelector("#signInModal .btn-primary")).click();
    }
    @Then("Muestra mensaje emergente que se realizo con exito")
    public void Muestra_mensaje_emergente_que_se_realizo_con_exito() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertThat(driver.switchTo().alert().getText(), is("Sign up successful."));

        driver.quit();
    }

}
