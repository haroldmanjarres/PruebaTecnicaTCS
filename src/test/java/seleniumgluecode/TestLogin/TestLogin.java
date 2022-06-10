package seleniumgluecode.TestLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestLogin {
    private ChromeDriver driver;
    @Given("El usuario se encuentra en la pagina home de Store")
    public void El_usuario_se_encuentra_en_la_pagina_home_de_Store() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harol\\Videos\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/#");
        driver.manage().window().setSize(new Dimension(1390, 751));
    }
    @When("Hace click sobre el buttton Log in de la pagina home de Store")
    public void Hace_click_sobre_el_buttton_Log_inde_la_pagina_home_de_Store() {
        driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[5]/a")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @When("Hace click en el campo de Username2")
    public void Hace_click_en_el_campo_de_Username2() {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).click();

    }
    @When("Ingresa datos de Pruebaharold6")
    public void Ingresa_datos_de_Pruebaharold6() {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("Pruebaharold6");
    }
    @When("Hace click en el campo de Password2")
    public void Hace_click_en_el_campo_de_Password2() {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input")).click();
    }
    @When("Ingresa datos de 123")
    public void Ingresa_datos_de_123() {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input")).sendKeys("123");
    }
    @When("Hace click sobre el buttton Log in")
    public void Hace_click_sobre_el_buttton_Log_in() {
        driver.findElement(By.cssSelector("#logInModal .btn-primary")).click();
    }
    @Then("Ingresa al login con exito")
    public void Ingresa_al_login_con_exito() {

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
    }
}
