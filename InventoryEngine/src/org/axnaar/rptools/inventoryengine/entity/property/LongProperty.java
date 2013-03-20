package org.axnaar.rptools.inventoryengine.entity.property;

public class LongProperty implements Property {
	
	private Long value = 0l;
	
	@Override
	public String getSelectorName() {
		return null;
	}

	@Override
	public String getValue() {
		return value.toString();
	}

	@Override
	public void setValue(String value) {
		this.value = Long.valueOf(value);
	}

}
