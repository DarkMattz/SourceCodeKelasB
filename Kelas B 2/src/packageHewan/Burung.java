package packageHewan;
public class Burung extends Hewan{
	private String name; //overriding
	
	public Burung(String name, int umur) {
		super(name, umur);
	}
	
	public void berjalan() { //overriding
		System.out.println("Burung gak suka jalan");
	}
	
	public void terbang() {
		System.out.println(super.name + " terbang");
	}
}
