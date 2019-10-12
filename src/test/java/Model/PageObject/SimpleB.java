package Model.PageObject;

import org.testng.annotations.Factory;

public class SimpleB {
	
	@Factory
	public Object[] factoryMethod() {
		return new Object[] {new SimpleA(), new SimpleA()};
	}
	
	
}
