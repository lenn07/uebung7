package h2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class H2_main {
    public static void main(String[] args) {
    	int[] x = { 2,7,1,9 };
		int[] y = { 2,7,1,9 };
	
		int[] z = change(x, y, 3, 2);

	}
    
    public static int[] change(int[]a,int[]b,int start, int end) {
    	if(end > start && Arrays.compare(a, b)!=0) {
    		int[] newA = Arrays.copyOfRange(a, 0, a.length);
    		return newA;
    	}else if(end > start && Arrays.compare(a, b)==0) {
    		Arrays.sort(a);
    		int[] newA = Arrays.copyOfRange(a, start, end);
    		return newA;
    	}
    	int[] array = new int[0];
    	return array;
    }
}
