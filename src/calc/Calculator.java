package calc;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Calculator {
	
	private static final Logger logger = Logger.getLogger(Calculator.class.getName());
	
	public static void main(String[] args) {
				
		
		int a = 10;
        int b = 20;

        int unused = 100;

        System.out.println(a + b);

        // Duplicated code
        int x = 10;
        int y = 20;
        System.out.println(x + y);

        // Empty catch block
        try {
            int result = a / 0;
        } catch (Exception e) {
            
        }

        // Hardcoded password
        String password = "admin123";

        if (a == 10) {
            System.out.println("Hello");
        }

      
    	logger.info("Hello world");
    	logger.log(Level.INFO, "Addition: {0}", a + b);
	}
}