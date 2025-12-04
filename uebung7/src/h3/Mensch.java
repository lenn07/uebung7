package h3;

public class Mensch {
    public String name ="Lenn Kanter";
    public int gebJahr = 2007, alter = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGebJahr() {
		return gebJahr;
	}
	public void setGebJahr(int gebJahr) {
		this.gebJahr = gebJahr;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter() {
		this.alter = 2025-gebJahr;
	}
    
    
}
