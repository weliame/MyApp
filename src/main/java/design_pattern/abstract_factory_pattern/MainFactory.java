package design_pattern.abstract_factory_pattern;



public class MainFactory {
	
	public String s = "";
	int a=0;
	
	 {/*w  w  w  . j a v  a  2 s  . c  o m*/
		 a=2;
		    System.out.println("Inside instance initializer 2.");
		  }
	{
		a=1;
	    System.out.println("Inside instance initializer 1.");
	  }


		  
	
	MainFactory() {
		this("test");
		// TODO Auto-generated constructor stub
	}
	
	MainFactory(String s){
		System.out.println(s);
		this.s = s;
	}

	public static AbstractFactory getFactory(String factory){
		MainFactory a = new MainFactory();
		System.out.println(a.a);
		System.out.println(a.s);
		if(factory == null){
			return null;
		}
		if(factory=="Account"){
			return new AccountPageFactory();
		}else if(factory=="Org"){
			return new OrgPageFactory();
		}else{
			return null;
		}
	}
	
	public static void main(String[] args) {
		AbstractFactory fac = MainFactory.getFactory("org");
		AccountContactPage acp = (AccountContactPage) ((AccountPageFactory)fac).getPage("Contact");
		OrgContactPage ocp = (OrgContactPage) ((OrgPageFactory)fac).getPage("Contact");
		acp.pringAccountPage();
		ocp.pringPage();
	}
}
