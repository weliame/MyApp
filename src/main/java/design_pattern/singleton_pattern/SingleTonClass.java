package design_pattern.singleton_pattern;

public class SingleTonClass {

	static SingleTonClass instance = new SingleTonClass();
	
	SingleTonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingleTonClass getInstance(){
		return instance;
	}
	
	public void pringSingleton(){
		System.out.println("SingleTonClass");
	}
	
	public static void main(String[] args){
		SingleTonClass st = SingleTonClass.getInstance();
		st.pringSingleton();
		SingleTonClass st2 = SingleTonClass.getInstance();
		System.out.println(st.toString());
		System.out.println(st2.toString());
	}
}
