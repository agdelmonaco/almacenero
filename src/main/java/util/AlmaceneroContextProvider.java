package util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AlmaceneroContextProvider implements ApplicationContextAware {

	public AlmaceneroContextProvider() {
		super();
	}

	@Override
	public void setApplicationContext(ApplicationContext aContext) throws BeansException {
		AlmaceneroApplicationContext.setApplicationContext(aContext);
	}

}
