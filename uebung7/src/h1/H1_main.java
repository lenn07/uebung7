package h1;

public class H1_main {
    public static void main(String[] args) {
		Zahl nZahl = new Zahl();
		nZahl.num = 1001;
		nZahl.setEven();
		nZahl.setPositve();
		nZahl.setSmall();
		System.out.println(nZahl.num);
		System.out.println(nZahl.even);
		System.out.println(nZahl.positve);
		System.out.println(nZahl.small);
	}
}
