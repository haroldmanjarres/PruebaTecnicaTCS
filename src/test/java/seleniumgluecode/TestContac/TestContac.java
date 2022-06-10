package seleniumgluecode.TestContac;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestContac {

    private ChromeDriver driver;
    @Given("El usuario se encuentra en la pagina home de Store")
    public void El_usuario_se_encuentra_en_la_pagina_home_de_Store() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harol\\Videos\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/#");
        driver.manage().window().setSize(new Dimension(1390, 751));
    }
    @When("Hace click sobre el buttton Contact de la pagina home de Store")
    public void Hace_click_sobre_el_buttton_Contact_de_la_pagina_home_de_Store() {
        driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[2]/a")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @When("Hace click en el campo Contact Email")
    public void Hace_click_en_el_campo_Contact_Email() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")).click();

    }
    @When("Ingresa datos en el campo Contact Email")
    public void Ingresa_datos_en_el_campo_Contact_Email() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("Prueba@hotmail.com");
    }
    @When("Ingresa datos en el campo Contact Name")
    public void Ingresa_datos_en_el_campo_Contact_Name() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/input")).sendKeys("Prueba harold manjarres");
    }
    @When("Hace click en el campoMessage")
    public void Hace_click_en_el_campoMessage() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/textarea")).click();
    }
    @When("Ingresa datos en el campo campoMessage")
    public void Ingresa_datos_en_el_campo_campoMessage() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/textarea")).sendKeys("Esto no es una prueba");
    }
    @When("Hace click sobre el buttton Send message")
    public void Hace_click_sobre_el_buttton_Send_message() {
        driver.findElement(By.cssSelector("#exampleModal .btn-primary")).click();
    }
    @Then("Muestra mensaje emergente que se realizo con exito")
    public void Muestra_mensaje_emergente_que_se_realizo_con_exito() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertThat(driver.switchTo().alert().getText(), is("Thanks for the message!!"));

        driver.quit();
    }

}
