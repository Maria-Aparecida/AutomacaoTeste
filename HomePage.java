package br.senai.sp.automacaoteste;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private WebDriver driver;
	
	@Before
	public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void TesteNavegarParaGoogle() {		
		
		driver.get("https://online.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Gest�o");
		
		//driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("Busca1_btnBusca")).click();		
		
	}
	//@After
	//public void FecharNavegador() {
	//	driver.close();
	//}

}