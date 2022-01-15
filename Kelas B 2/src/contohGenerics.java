
public class contohGenerics<T> {
	private T variable1;
	private T variable2;
	
	public contohGenerics(T variable1, T variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}
	
	public void print() {
		System.out.println(variable1);
		System.out.println(variable2);
	}
}
