
public class SpacedLogger implements Logger {

	@Override
	public void log(String str1) {
		// TODO Auto-generated method stub

		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			
			if (i < str1.length() - 1) {
				sb1.append(str1.charAt(i) + " ");

			} else {
				sb1.append(str1.charAt(i));
			}

		}
		System.out.println(sb1);
	}

	@Override
	public void error(String str2) {
		// TODO Auto-generated method stub

		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < str2.length(); i++) {
			if (i < str2.length() - 1) {
				sb2.append(str2.charAt(i) + " ");

			} else {
				sb2.append(str2.charAt(i));
			}
		}
		System.err.println("ERROR: " + sb2);
	}
}