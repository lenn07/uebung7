package h1;

public class Zahl {
    public boolean even = false, small = false, positve = false;
    public int num = 0;
	public boolean isEven() {
		return even;
	}
	public void setEven() {
		if(num % 2 == 0) {
			even = true;
		}else {
			even = false;
		}
	}
	public void setSmall() {
		if(num < 100) {
			small = true;
		}else {
			small= false;
		}
	}
	public void setPositve() {
		if(num > 0) {
			positve = true;
		}else {
			positve = false;
		}
	}
    
    
}
