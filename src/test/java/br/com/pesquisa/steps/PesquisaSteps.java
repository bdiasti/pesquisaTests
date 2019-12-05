package br.com.pesquisa.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaSteps {
	
	private WebDriver driver;
	
	@Quando("^Colocar o titulo do pesquisa$")
	public void colocarOTituloDoPesquisa() throws Throwable {
		System.setProperty("webdriver.chrome.driver","<coloque o caminho do seu driver do chrome>");
		driver = new ChromeDriver();
		driver.get("https://www.strawpoll.me/");
		driver.findElement(By.xpath("//*[@id=\"form-field-content-editable\"]/div")).sendKeys("Onde será o almoço de fim de ano");
	}

	@Quando("^colocar perguntas$")
	public void colocarPerguntas() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"field-options-1-option\"]")).sendKeys("Pizzaria");
		driver.findElement(By.xpath("//*[@id=\"field-options\"]/div[2]/input")).sendKeys("Churrascaria");
		driver.findElement(By.xpath("//*[@id=\"field-options\"]/div[3]/input")).sendKeys("Japones");
	}
	
	@Quando("^enviar a pergunta$")
	public void enviarAPergunta() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"create-button\"]")).click();
		Thread.sleep(5000);
	}

	@Então("^a pesquisa deve ser criada$")
	public void aPesquisaDeveSerCriada() throws Throwable {
		String texto = driver.findElement(By.xpath("/html/body/main/form/footer/button[1]")).getText();
		Assert.assertEquals("Vote", texto);
	}


	@After(order = 1)
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 0)
	public void fecharBrowser() {
		driver.quit();
		System.out.println("terminando");
	}
}
