package org.axnaar.rptools.inventoryengine.entity.property;

public class StringProperty implements Property {
	
	private String value = "";	
	
	
	@Override
	public String getSelectorName() {
		return "org.axnaar.rptools.inventoryengine.selectors.defaultStringSelector";
	}

	@Override
	public String getValue() {

		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

	

}
