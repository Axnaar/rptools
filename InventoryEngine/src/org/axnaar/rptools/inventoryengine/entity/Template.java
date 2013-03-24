package org.axnaar.rptools.inventoryengine.entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.Property;


public interface Template {

	
	public Map<String, String> getProperties();
	public List<String> getPropertyNames();
	public String removeProperty(String name);
	public String addProperty(String name, String property);
	public String getName();
	
}
