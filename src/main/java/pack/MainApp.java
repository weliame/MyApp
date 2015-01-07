/**
 * @Title: MainApp.java
 * @Package pack
 * Copyright: Copyright (c) 2011 
 * Company:Everbridge.Inc
 * 
 * @author wyq
 * @date Jan 6, 2015 1:58:19 PM
 * @version V1.0
 * @Description: TODO
 */
package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description: TODO
 * @author wyq
 * @date Jan 6, 2015 1:58:19 PM
 */
public class MainApp {
	 public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");	
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      obj.setMessage(null);
	      HelloWorld obj4 = (HelloWorld) context.getBean("helloWorld");
	      obj4.getMessage();
	      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld2");
	      obj2.getMessage();
	      HelloWorld obj3 = (HelloWorld) context.getBean("message");
	      obj3.getMessage();
	   }
}
