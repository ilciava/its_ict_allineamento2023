package its.lez04.oop.recap;

public class Automobile {
	
	private String marca;
	private String modello;
	private int cilindrata;
	
	public Automobile() {
		System.out.println("Costruttore di default invocato");
	}
	
	// Automobile(String, String)
	public Automobile(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
		
		System.out.println("Costruttore con 2 parametri invoc.");
	}
	
	// Automobile(String, int)
	public Automobile(String modello, int cilindrata) {
		this.modello = modello;
		this.cilindrata = cilindrata;
		
		System.out.println("Costruttore con 2 parametri invoc.");
	}
	
	public Automobile(String marca, String modello, int cilindrata) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		
		System.out.println("Costruttore con 3 parametri invoc.");
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void stampaDetaglio() {
		System.out.println(this.marca + ", " + this.modello  + ", " + this.cilindrata);
	}
	
	

}
