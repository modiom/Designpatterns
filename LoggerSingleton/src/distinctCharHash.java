import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.stream.Collectors;
//Sorting Character string in descending order of occurrence count
public class distinctCharHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Log1";
		//Requesting a Instance of Logger class with name LogFile1
		SingletonLogger logging = SingletonLogger.getInstance(name);
		logging.log.log(Level.INFO, "Waiting for an logger instance of name "+ name);
		logging.log.log(Level.INFO, "Received an logger instance with name "+ logging.log_name);
		System.out.println("Enter the string");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		Map<Character, Integer> freq = new TreeMap<>();
		for(Character temp : input.toUpperCase().toCharArray()) {
			if(((int)temp > 64 && (int)temp < 91)) {
				if(freq.containsKey(temp)) 
					freq.put(temp, freq.get(temp)+1);
				else
					freq.put(temp, 1);
					
			}
				
		}
		logging.log.log(Level.INFO,"Instance: "+logging.log_name + " The keyset is :"+ freq.keySet());
		name = "Log2";
	    logging = SingletonLogger.getInstance(name);
		logging.log.log(Level.INFO, "Expecting an instance of name "+ name);
		logging.log.log(Level.INFO, "Received an instance with name "+ logging.log_name);
		freq.forEach((k,v)->System.out.println(k + "	" + v));
		//Sorting characters in string in descending order
		freq = freq.entrySet()
		        .stream()
		        .sorted(Map.Entry.<Character, Integer> comparingByValue().reversed())
		        .collect(
		            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
		                LinkedHashMap::new));
		logging.log.log(Level.INFO,"Instance: "+logging.log_name + " The sorted keyset of Character String in descending is :"+ freq.keySet());
		freq.forEach((k,v)->System.out.println(k + "	" + v));
		
}

}
