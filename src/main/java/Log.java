import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
	private static final Logger logger = Logger.getLogger("Minecraft");
	
	public static void info(String msg) {
		logger.info(msg);
	}
	
	public static void info(String msg, Object... args) {
		logger.log(Level.INFO, msg, args);
	}

	public static void error(String msg) {
		logger.severe(msg);
	}
	
	public static void severe(String msg, Object... args) {
		logger.log(Level.SEVERE, msg, args);
	}
	public static void warning(String msg) {
		logger.warning(msg);
	}
	
	public static void warning(String msg, Object... args) {
		logger.log(Level.WARNING, msg, args);
	}
	
	public static void trace(String msg) {
		logger.finest(msg);
	}
	
	public static void trace(String msg, Object... args) {
		logger.log(Level.FINEST, msg, args);
	}
}
