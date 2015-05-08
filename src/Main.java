import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String args[]) {
		Scanner Sc= new Scanner(System.in);
		String stdin;
		int i=0;
		HashMap tab = new HashMap();
		ArrayList tabalt = new ArrayList();
		System.out.println("Bonjour ! Taper STOP pour arretez le programme .");
		while (i<=100000){
			System.out.println("Composer un mot : ");
			stdin=Sc.nextLine();
			if(stdin.length()>20){
				System.out.println("ATTENTION : mot trop long !");
				System.out.println("Veuillez retaper votre mot : ");
				stdin=Sc.nextLine();
			}
			if (stdin.equals("STOP")) {
				break;
			}
			tabalt.add(stdin);
			i++;
		}
		for (int a=0;a<tabalt.size();a++) {
				if(!tab.containsValue(tabalt.get(a))){
					int b=0;
					int nbr=0;
					while (b<tabalt.size()) {
						if(tabalt.get(a).equals(tabalt.get(b)))
							nbr++;
							b++;		
						}
					tab.put(tabalt.get(a),nbr);
				}
		}
		TreeMap sortedHashMap = new TreeMap(tab);
		System.out.println("K mots les plus fréquents sont : ");
		System.out.println(sortedHashMap);
	}
}
