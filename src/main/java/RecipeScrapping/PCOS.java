package RecipeScrapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PCOS extends BaseClass{
	
     List<String> Eliminators =Arrays.asList(new String[] {"processed grains","rice","white Bread","pasta","beverages","rice flour", "rice rava", "sugar", "white rice","soda","flavoured water",
          "gatorade","fruit juice","apple juice","orange juice","pomegrante juice","margarines","peanut butter","spreads","frozen foods","flavoured yogurt",
          "flavoured curd","honey","maple syrup","jaggery","sweets","candies","chocolates","alcoholic beverages","processed meat", "bacon", "sausages",
          "hot dogs","deli meats","chicken nuggets","chicken patties","Jams","Jelly","Pickled food","mango", "cucumber","tomatoes",
          "canned fruits","canned vegetables","pineapple", "peaches", "mangos", "pear", "mixed fruit", "mandarine oranges", "cherries", "chips","mayonnaise",
          "palmolein oil","powdered milk","beans","peas","corn","doughnuts","cakes","pastries","cookies","croissants","sweetened tea","coffee",
          "packaged snacks","soft drinks","banana","bananas","melon","Dairy Milk","butter", "cheese"});

	
	@Test(priority=1)
	public void browserOpening(){
	
		System.out.println("Launch Browser" );
		
	}
	
	@Test(priority=2)
	public void WebScrapping (){
		driver.findElement(By.xpath("//*[contains(text(),'Recipe A To Z')]")).click();
		String pagenumber =driver.findElement(By.className("rescurrpg")).getText();
		System.out.println("Page number "+ pagenumber);
	}
}
