import java.util.Scanner;
import java.util.TreeSet;


public class TreeSetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet set = new TreeSet();
		Scanner scan = new Scanner(System.in);
		String sentence;
		
		System.out.println("Enter stuff: ");
		sentence = scan.nextLine();
		
		String[] str = sentence.split(" ");
		
		for(String i: str){
			set.add(i);
		}
		
		int size = set.size();
		System.out.println(set);
		System.out.println("Size: " + size);

	}

}
