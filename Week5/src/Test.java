
public class Test {

	public static void main(String[] args) {

		String str1 = "Bob";
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			if (i < str1.length() - 1) {
				sb1.append(str1.charAt(i) + " ");

			} else {
				sb1.append(str1.charAt(i));
			}
		}
		System.out.println(sb1);

		
		
		
		
		
		String str2 = "Jill";
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < str2.length(); i++) {

			if (i < str2.length() - 1) {
				sb2.append(str2.charAt(i) + " ");

			} else {
				sb2.append(str2.charAt(i));
			}
		}
		System.out.println("ERROR: " + sb2);
	}

}

