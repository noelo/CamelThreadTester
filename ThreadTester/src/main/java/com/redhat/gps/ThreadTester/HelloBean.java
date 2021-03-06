package com.redhat.gps.ThreadTester;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A bean which we use in the route
 */
public class HelloBean implements Hello {

	private String say = "Hello World";

	public String hello() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return say + " at " + sdf.format(new Date());
	}

	public String helloQuick() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return say + " at " + sdf.format(new Date());
	}

	public String getSay() {
		return say;
	}

	public void setSay(String say) {
		this.say = say;
	}
}
