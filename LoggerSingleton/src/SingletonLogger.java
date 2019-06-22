import java.util.logging.Logger;

public class SingletonLogger {
	
	private static SingletonLogger instance = null;
	Logger log ;
    public  String log_name;
	private SingletonLogger(String log_name) {
		super();
		this.log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		this.log_name = log_name;
	}
public static SingletonLogger getInstance(String log_name) {
    	
        if (instance == null) {
            instance = new SingletonLogger(log_name);
        }
    	
        return instance;
    }
    
}
