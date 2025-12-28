package com.ejemplo.proyecto;

// 1. ESTOS SON LOS IMPORTS (Van fuera de la clase)
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpractice {

	public static void main(String[] args) {
		
		// 2. AQUÍ PEGAS EL CÓDIGO (Dentro del main)
		
		// Inicializamos el navegador
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navegamos a la página
		driver.get("https://www.saucedemo.com/");

		// LOGIN: Usando tus localizadores personalizados
		// CSS con atributo placeholder
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
		
		// XPath con atributo data-test
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		
		// Click en Login (CSS con ID)
		driver.findElement(By.cssSelector("#login-button")).click();

		// TRAVERSING: Obtener el nombre del primer producto
		String primerProducto = driver.findElement(By.xpath("//div[@class='inventory_item_description'] //div[@class='inventory_item_name ']")).getText();
		
		System.out.println("--------------------------");
		System.out.println("✅ El primer producto es: " + primerProducto);
		System.out.println("--------------------------");

		// Cerramos el navegador
		driver.quit();
	}
}
		
		
		

