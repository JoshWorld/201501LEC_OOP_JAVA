import java.util.*;

public class HashMapDic {

	static Scanner scanner;
	static HashMap<String, String> dic;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		dic = new HashMap<String,String>();
		
		while(true) {
			System.out.println("(1. input 2. search 3. print dictionary 4. longest word 0. exit)");
			int input = scanner.nextInt();
			
			switch(input) {
			case 1: addWord(); break;
			case 2: searchWord(); break;
			case 3: printDic(); break;
			case 4: findLongest(); break;
			case 0: return;
			default: System.out.println("invalid input");
			}
		}	
	}
	
	static void addWord() {
		System.out.print("English Word: ");
		String word = scanner.next();
		System.out.print("meaning: ");
		String mean = scanner.next();
		dic.put(word, mean);
	}
	
	static void searchWord() {
		System.out.print("Search for: ");
		String word = scanner.next();
		System.out.println("meaning: " + dic.get(word));
	}
	
	static void printDic() {
		Set<String> keySet = dic.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String word = it.next();
			String mean = dic.get(word);
			System.out.println(word+":"+mean);
		}
	}
	
	static void findLongest() {
		
	}
	
}
