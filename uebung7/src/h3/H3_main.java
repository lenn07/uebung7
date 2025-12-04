package h3;

public class H3_main {
    public static void main(String[] args) {
		Mensch m1 = new Mensch();
		m1.setName("Elsa");
		m1.setGebJahr(2010);
		m1.setAlter();
		System.out.println(m1.getName());
		System.out.println(m1.getGebJahr());
		System.out.println(m1.getAlter());
	}
}
