package generics;

public class MaximumCheck {

	public Float maximumValue(Float d, Float e, Float f) {
		Float max = d;
		if (e.compareTo(max) > 0) {
			max = e;
		} if (f.compareTo(max) > 0) {
			max = f;
		} 
		System.out.println(max +" is Maximum");
		return max;
	}
}