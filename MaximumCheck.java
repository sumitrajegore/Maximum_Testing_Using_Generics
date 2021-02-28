package generics;

public class MaximumCheck {

	public String maximumValue(String d, String e, String f) {
		
		String max = d;
		if (e.compareTo(max) > 0) {
			
			max = e;
		} if (f.compareTo(max) > 0) {
			
			max = f;
		} 
		System.out.println(max +" is Maximum");
		return max;
	}
}