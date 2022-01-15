package packageHewan;

public class Hewan {
	protected String name;
	private int umur;
	
	public Hewan(String name, int umur) {
		this.name = name;
		this.umur = umur;
	}
	
	public void berjalan() {
		final String test = "Hello";
		System.out.println(name + " Berjalan");
	}
	
	public void getUmur() {
		System.out.println(name + " berumur " + umur);
	}
}
