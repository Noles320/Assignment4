import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
public class TreeMapPractice {

	public static void main(String[] args) {
		String ans = "no", name, sub;
		int vowels = 0;
		
		Scanner scan = new Scanner(System.in);
		
		TreeMap<String, Integer> tree = new TreeMap<>();
		
		while (ans.equalsIgnoreCase("no"))
		{
			System.out.println("Enter a name: ");
			name = scan.next();
			
			for (int i = 0; i < name.length(); i++)
			{
				sub = name.substring(i, i+1);
				System.out.println(sub);
				
				
				if (sub.equalsIgnoreCase("a") == true)
					vowels++;
				else if (sub.equalsIgnoreCase("e") == true)
				    vowels++;
				  else if (sub.equalsIgnoreCase("i") == true)
				    vowels++;
				  else if (sub.equalsIgnoreCase("o") == true)
				    vowels++;
				  else if (sub.equalsIgnoreCase("u") == true)
				    vowels++;
				  else if (sub.equalsIgnoreCase("y") == true)
					    vowels++;
			}
			
			tree.put(name, vowels);
			vowels = 0;
			System.out.println("Are you finsihed adding names?");
			ans = scan.next();
		}
		for(String k : tree.keySet())
		{
			System.out.println("Key:"+k + "  Value:" + tree.get(k));
		}
	}

}
