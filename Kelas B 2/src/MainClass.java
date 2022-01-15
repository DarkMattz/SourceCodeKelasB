import packageHewan.Burung;
import packageHewan.Hewan;
import packageHewan.Ikan;

public class MainClass {
	public static void main(String[] args) {
//		Burung rajawali = new Burung("Rajawali", 5);
//		rajawali.terbang();
//		rajawali.berjalan();
//		rajawali.getUmur();
		
//		//Casting
//		Hewan koi = new Ikan("Koi", 1);
//		
//		//Downcasting
//		Ikan koiDua = (Ikan)koi;
//		koiDua.berjalan();
//		koiDua.getUmur();
//		koiDua.berenang();
//		System.out.println(koiDua.getName());
//		
//		
//		//Upcasting
//		Hewan koiTiga = koiDua;
//		koiTiga.berjalan();
//		koiTiga.getUmur();
		
		Ikan ikanSatu = new Ikan("Ikan satu", 25);
		
		Ikan test = (Ikan)(new Hewan("test", 10));
		
		Hewan hewanSatu = (Hewan)ikanSatu; //upcasting
		
		Ikan ikanDua = (Ikan)hewanSatu; //downcasting
//		Hewan hewanSatu = new Hewan("Andi", 10);
//		Hewan hewanDua = new Hewan("Budi", 12);
//		contohGenerics<Hewan> contoh = new contohGenerics<Hewan>(hewanSatu, hewanDua);
//		contoh.print();
	}
}
