
public class AsteriskLogger implements Logger {



	@Override
	public void log(String str1) {
		// TODO Auto-generated method stub
		System.out.println("***" + str1 + "***");
	}

	@Override
	public void error(String str2) {
		// TODO Auto-generated method stub
		String star = "*".repeat(13 + str2.length());
		System.err.println(star + "\n" + "***" + "ERROR: " + str2 + "***" + "\n" + star);
	}
}
