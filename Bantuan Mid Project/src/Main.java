import java.util.ArrayList;
import java.util.Scanner;

import packageHewan.Burung;
import packageHewan.Kucing;

public class Main {
	
	
	private static Burung pemasukanDataBurung() {
		Scanner input = new Scanner(System.in);
		Burung burungBaru = new Burung();
		
		burungBaru.setName(input.nextLine());
		
		
		return burungBaru;
	}

	public static void main(String[] args) {
		ArrayList<Burung> kumpulanBurung = new ArrayList<Burung>();
		ArrayList<Kucing> kumpulanKucing = new ArrayList<Kucing>();
		
//		while(true) {
//			kumpulanBurung.add(pemasukanDataBurung());
//			
//			Scanner input = new Scanner(System.in);
//			
//			System.out.println("Apakah ingin berhenti? Ya/Tidak");	
//			if(input.nextLine().equals("Ya")) {
//				break;
//			}
//		}
//		
		
		
		for(int i = 0; i < kumpulanBurung.size(); i++) {
			System.out.println(kumpulanBurung.get(i).getName());
		}
		
		for(int i = 0; i < kumpulanKucing.size(); i++) {
			
		}
	}
}
