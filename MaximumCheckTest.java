package generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	// test to check if maximum value is at first position.
	@SuppressWarnings("deprecation")
	@Test
	public void MaximumValueAtFirstPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		float maximum = maximumCheck.maximumValue(15.5f, 12.4f, 14.5f);
		Assert.assertEquals(15.5f, maximum, 0.001);
	}

	// test to check if maximum value is at second position.
	@SuppressWarnings("deprecation")
	@Test
	public void MaximumValueAtSecondPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		float maximum = maximumCheck.maximumValue(12.5f, 15.7f, 14.3f);
		Assert.assertEquals(15.7f, maximum, 0.001);
	}

	// test to check if maximum value is at third position.
	@SuppressWarnings("deprecation")
	@Test
	public void MaximumValueAtThirdPosition() {
		MaximumCheck maximumCheck = new MaximumCheck();
		float maximum = maximumCheck.maximumValue(12.4f, 14.4f, 15.2f);
		Assert.assertEquals(15.2f, maximum, 0.001);
	}
}