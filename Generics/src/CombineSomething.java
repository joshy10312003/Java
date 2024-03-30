
public class CombineSomething<T, V> {
	
	T obj;
	V obj2;
	
	CombineSomething(T obj, V obj2){
		this.obj = obj;
		this.obj2 = obj2;
		System.out.print(obj);
		System.out.print(" ");
		System.out.print(obj2);
	}
	CombineSomething(){
	}
	void add(T obj, V obj2) {
		System.out.print(obj);
		System.out.print(" ");
		System.out.print(obj2);
	}
	
	
	public static void main(String[] args) {
		
		CombineSomething<String, Integer> e = new CombineSomething<String, Integer>();
		
		e.add("String", 2);
	}

}
