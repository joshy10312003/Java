public class LambdaExample {
    public static void main(String[] args) {
    	
    	Multiplication n = (a, b) -> a * b;
    	int r = n.multiply(5, 8);
    	new Printable(r);
    	
    }
}
interface Multiplication {
	
	int multiply(int a, int b);
	
}
class Printable {
	
	Printable(String s)	{ System.out.println(s); }
	Printable(int i) 	{ 
		int r = i;
		System.out.println(r); 
	}
}