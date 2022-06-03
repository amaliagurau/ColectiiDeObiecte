import java.util.LinkedList;
import java.util.Scanner;

public class ColectiiDeObiecte {

		public static void main(String[] args) {
			LinkedList<String> colectia1 = new LinkedList();
			LinkedList<String> colectia2 = new LinkedList();

			Scanner sc = new Scanner(System.in);
			while(true) {
				String s = sc.nextLine();
				if(s.equals("STOP"))
					break;
				colectia1.add(s);	
				}
			System.out.println("Contine duplicari!");
			for (int i = 0; i < colectia1.size(); i++) {
	            System.out.println(colectia1.get(i));
	        }
			for(String ss: colectia1)
	        {
	            if(!colectia2.contains(ss))
	            	colectia2.add(ss);
	        }
			System.out.println("Fara duplicari!");
			for (int i = 0; i < colectia2.size(); i++) {
	            System.out.println(colectia2.get(i));
	        }
		}
	}