package POC_FIT.fitneese;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITest {
	private WebDriver driver;
	private String Title;
	private String url;

	public String getTitle() {
		url = "http://"  + url;
		System.setProperty("webdriver.chrome.driver",
				"d:\\s.w\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(url);
		Title = driver.getTitle();
		driver.close();
		return Title;
	}

	public void setUrl(String url) {
		this.url = url;

	}

	public String getUrl() {
		return url;
	}

	public static void main(String[] args) {

		UITest uitest = new UITest();
		uitest.setUrl("http://www.google.com");

		System.out.println(uitest.getTitle());

	}

}
