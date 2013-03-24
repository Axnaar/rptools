package org.axnaar.rptools.inventoryengine.entity.property;

public abstract class Property {
	
	
	public abstract String getSelectorName();
	public abstract String getValue();
	public abstract void setValue(String value);

	public String toString(){
		return "(" + this.getClass().getName() + ") : " + getValue() ;
	}
	
	
}
