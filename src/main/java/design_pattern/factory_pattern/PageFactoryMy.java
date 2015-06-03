package design_pattern.factory_pattern;

public class PageFactoryMy {

	public static Page getPage(String pageType){
		if(pageType==null){
			return null;
		}
		if(pageType=="Contact"){
			return new OrgContactPage();
		}else if(pageType=="Notification"){
			return new OrgNotificationPage();
		}else if(pageType=="Report"){
			return new OrgReportPage();
		}else 
			return null;
	}
	
	public static void main(String[] args){
		OrgContactPage ocp = (OrgContactPage) PageFactoryMy.getPage("Contact");
		ocp.pringPage();
		
		Page p = PageFactoryMy.getPage("Notification");
	}
}
