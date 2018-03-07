import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	static Logger logger = Logger.getGlobal();

	public static void main(String[] args) {

		logger.log(Level.SEVERE, "Severe event");
		logger.log(Level.INFO, "INFO event");
		logger.log(Level.FINER, "FINER event.");  // not logged due to current logging.properties
		AnotherClass ac = new AnotherClass();
		ac.testMethod();

	}

}