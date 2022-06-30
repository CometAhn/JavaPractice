class obj {
	int subtract (int a, int b) {
  result = a – b;
  return result;
 }
}

public class exam7 {
	public static void main(String[] args) {
		obj a = new obj();
		System.out.println(a.subtract(100, 200));
	}
}