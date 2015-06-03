package order;


public class MyGeneric<AC> {

	private AC t;
	
	public AC get(){
		return t;
	}
	
	public void set(AC val){
		this.t = val;
	}
	
	public <G extends Number> AC testGeneParam(){
		return this.get();
	}
	
	public <E> void testGeneParam2(E[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
	
	public class NewGene extends MyGeneric<AC>{}
	
	public static void main(String[] args){
		MyGeneric<Boolean> s = new MyGeneric<>();
		s.set(true);
		System.out.println(s.get());
		System.out.println(s.testGeneParam());
		MyGeneric<String> s2 = new MyGeneric<>();
		s2.set("aaa");
		System.out.println(s2.testGeneParam());
		s2.testGeneParam2(new String[]{"rrrr","aaaabbb"});
	}
}
