package vitoraugusto.core;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class TesteMenegat {
	
	@Test
	public void testeLogin() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "/Volumes/Secundario/Teste Menegat/geckodriver");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().setSize(new Dimension(1200, 1200));
	  driver.get("https://adrianamenegat.com.br/member-login/");
	  
	  //teste login
	  
	  driver.findElement(By.id("iump_login_username")).sendKeys("vitoraugustog");
	  Assert.assertEquals("vitoraugustog", driver.findElement(By.id("iump_login_username")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  //teste senha
	  
	  driver.findElement(By.id("iump_login_password")).sendKeys("bsl268xtz");
	  Assert.assertEquals("bsl268xtz", driver.findElement(By.id("iump_login_password")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  //botao login
	  
	  driver.findElement(By.className("impu-form-submit")).click();
	  Thread.sleep(600);
	  
	  //botao aulas
	  
	  driver.findElement(By.linkText("Aulas")).click();
	  Thread.sleep(600);
	  
	  //botao assistir
	  
	  driver.findElement(By.linkText("Assistir")).click();
	  Thread.sleep(600);
	
	  // driver.quit();
	  

			}
					
	}
	

