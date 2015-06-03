package design_pattern.prototype_pattern;

public class Page implements Cloneable {

	protected String pageStr;
	
	public Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
	
	public void printPage(){
		System.out.println("Page");
	}
	

}
