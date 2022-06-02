import java.util.Date;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpacedLogger sL = new SpacedLogger();
		sL.log("Bob");
		sL.error("Sally");
		
		System.out.println();

		
		AsteriskLogger aL = new AsteriskLogger();
		aL.log("Joe");
		aL.error("Jill");
		
		
		//extra concepts from office hour
		System.out.println("\n\n\n");
		Date day = new Date();
		sL.log(day.toString());
		aL.log(day.toString());
		
		
		
		
		
	}

}
