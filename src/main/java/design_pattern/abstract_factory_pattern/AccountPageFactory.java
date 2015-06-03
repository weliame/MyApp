package design_pattern.abstract_factory_pattern;


public class AccountPageFactory implements AbstractFactory{

	public static AccountPage getPage(String pageType){
		if(pageType==null){
			return null;
		}
		if(pageType=="Contact"){
			return new AccountContactPage();
		}else if(pageType=="Notification"){
			return new AccountNotificationPage();
		}else 
			return null;
	}
	
	public static void main(String[] args){
		AccountContactPage ocp = (AccountContactPage) AccountPageFactory.getPage("Contact");
		ocp.pringAccountPage();
	}
}
