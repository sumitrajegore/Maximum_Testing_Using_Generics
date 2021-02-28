package generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	// test to check if maximum value is at first position.
	@Test
	public void MaximumValueAtFirstPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		String maximum = maximumCheck.maximumValue("Apple", "Peach", "Banana");
		Assert.assertEquals( "Peach" , maximum);
	}

	// test to check if maximum value is at second position.
	@Test
	public void MaximumValueAtSecondPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		String maximum = maximumCheck.maximumValue("Apple", "Peach", "Banana");
		Assert.assertEquals( "Peach" , maximum);
	}

	// test to check if maximum value is at third position.
	@Test
	public void MaximumValueAtThirdPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		String maximum = maximumCheck.maximumValue("Apple", "Peach", "Banana");
		Assert.assertEquals( "Peach", maximum);
	}
}