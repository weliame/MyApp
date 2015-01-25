package pack;

public class MyTest {

	public int fac(int n){
		 int f;
		    if (n == 0)
		    {
		        f = 1;
		    }
		    else
		    {
		        f = fac(n-1)*n;
		    }
		    return f;
	}
	
	public static void main(String[] args)
	{
		MyTest mt = new MyTest();
	    int m = mt.fac(5);
	    System.out.println(m);
	}

}
