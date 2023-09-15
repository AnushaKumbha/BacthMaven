package TestngJekins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
  @Test
  public void ld() {
	  String name = "Landon";
	  Assert.assertEquals(name, "Landon");
	  System.out.println("The Given Country Is Correct As:" +name);
  }
  @Test
  public void sa() {
	  String name = "South Africa";
	  Assert.assertEquals(name, "South Africa");
	  System.out.println("The Given Country Is Correct As:" +name);
  }
  @Test
  public void po() {
	  String name = "Poland";
	  Assert.assertEquals(name, "Poland");
	  System.out.println("The Given Country Is Correct As:" +name);
  }
  @Test
  public void sl() {
	  String name = "Srilanka";
	  Assert.assertEquals(name, "Srilanka");
  }
	  @Test
	  public void cn() {
		  String name = "China";
		  Assert.assertEquals(name, "China");
		  System.out.println("The Given Country Is Correct As:" +name);  
  }
  
}
