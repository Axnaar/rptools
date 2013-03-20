package org.axnaar.rptools.inventoryengine.entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.Property;


public interface Entity {

	
	public Map<String, Property> getProperties();
	public List<String> getNames();
	public Property removeProperty(String name);
	public Property setProperty(String name, Property property);
	public Property addProperty(String name, Property property);
	
	
}
