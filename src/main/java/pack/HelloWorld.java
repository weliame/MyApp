/**
 * @Title: HelloWorld.java
 * @Package pack
 * Copyright: Copyright (c) 2011 
 * Company:Everbridge.Inc
 * 
 * @author wyq
 * @date Jan 6, 2015 1:56:08 PM
 * @version V1.0
 * @Description: TODO
 */
package pack;

/**
 * @ClassName: HelloWorld
 * @Description: TODO
 * @author wyq
 * @date Jan 6, 2015 1:56:08 PM
 */
public class HelloWorld {
	private String message;

	public HelloWorld(){
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
