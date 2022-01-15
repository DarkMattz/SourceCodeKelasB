package packageHewan;

public class Ikan extends Hewan{
	private String name;
	
	public Ikan(String name, int umur) {
		super(name, umur);
		this.name = "Andi";
	}

	public void berjalan() { //overriding
		System.out.println("Ikan gak bisa berjalan");
	}
	
	public void berenang() {
		System.out.println(super.name + " berenang");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
