package TestngJekins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void tl() {
	  String name = "Thailand";
	  Assert.assertEquals(name, "Thailand");
	  System.out.println("The Given Country Is Correct As:" +name);
  }
  @Test
  public void ja() {
	  String name = "Japan";
	  Assert.assertEquals(name, "Japan");
	  System.out.println("The Given Country Is Correct As:" +name);
  }
  @Test
  public void ge() {
	  String name = "Germany";
	  Assert.assertEquals(name, "Germany");
	  System.out.println("The Given Country Is Correct As:" +name);
  }
  @Test
  public void ca() {
	  String name = "Canada";
	  Assert.assertEquals(name, "Canada");
  }
	  @Test
	  public void as() {
		  String name = "Austrila";
		  Assert.assertEquals(name, "Austrila");
		  System.out.println("The Given Country Is Correct As:" +name);  
  }
  
}
