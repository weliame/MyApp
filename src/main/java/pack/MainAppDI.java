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
public class MainAppDI {
	 public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans2.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");

	      te.spellCheck();
	   }
}
