package org.axnaar.rptools.inventoryengine.entity.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.Property;

public class Entity implements org.axnaar.rptools.inventoryengine.entity.Entity {

	
	HashMap<String, Property> properties = new HashMap<String, Property>(); //HashMap<String, Property>();
	
	@Override
	public Map<String, Property> getProperties() {
		return properties;
	}

	@Override
	public List<String> getNames() {
		List<String> result = new LinkedList<String>(properties.keySet()); 
		Collections.sort(result);
		return result;
	}

	

	@Override
	public Property setProperty(String name, Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property addProperty(String name, Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property removeProperty(String name) {
		Property property = properties.get(name);
		if(property != null){
			properties.remove(property);
			return property;
		}
			
		return null;
	}

}