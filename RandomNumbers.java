import java.util.Scanner;
 
 public class RandomNumbers {
     public static void main( String[] args ) {
     
		// random # from 1-3
        int a, b, c;
		a = 1+ (int)(3*Math.random()) ;
		b = 1+ (int)(3*Math.random()) ;
		c = 1+ (int)(3*Math.random()) ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		// imitate dice
		int d, e, f;
		d = 1+ (int)(6*Math.random()) ;
		e = 1+ (int)(6*Math.random()) ;
		f = 1+ (int)(6*Math.random()) ;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println();
		
		// random # from 5 to 10
		int g, h, i;
		g = 5 + (int) (5 * Math.random()) ;
		h = 5 + (int) (5 * Math.random()) ;
		i = 5 + (int) (5 * Math.random()) ;
		
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println();
     }
 }
