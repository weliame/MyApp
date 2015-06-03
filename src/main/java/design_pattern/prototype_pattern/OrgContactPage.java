package design_pattern.prototype_pattern;

public class OrgContactPage extends Page{
	
	public void printMsg(){
		System.out.println("OrgContactPage");
	}
	
	public static void main(String[] args){
		OrgContactPage p = (OrgContactPage) new OrgContactPage().clone();
		p.printPage();
		p.printMsg();
	}
}
