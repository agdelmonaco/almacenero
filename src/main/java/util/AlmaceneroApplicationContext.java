package util;
/**
 * Este paquete contiene clases �tiles para trabajar con el framework Spring.
 */

import java.io.Serializable;

import org.springframework.context.ApplicationContext;

public class AlmaceneroApplicationContext implements Serializable {

	private static final long serialVersionUID = -8314525704793980700L;

	private static ApplicationContext applicationContext;
	
	public static void setApplicationContext(ApplicationContext aContext) {
		applicationContext = aContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
