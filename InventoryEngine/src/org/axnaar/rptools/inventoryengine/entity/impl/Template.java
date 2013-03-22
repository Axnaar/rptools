package org.axnaar.rptools.inventoryengine.entity.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.Property;

public class Template implements org.axnaar.rptools.inventoryengine.entity.Template {

	
	Map<String, Property> properties = new HashMap<String, Property>(); 
	private String name = "Undefined";
	
	@Override
	public Map<String, Property> getProperties() {
		return properties;
	}

	@Override
	public List<String> getPropertyNames() {
		List<String> result = new LinkedList<String>(properties.keySet()); 
		Collections.sort(result);
		return result;
	}

	@Override
	public Property setProperty(String name, Property property) {
		if(properties.containsKey(name)){
			properties.put(name, property);
			return null;
		}else{
			return addProperty(name, property);
		}
	}

	@Override
	public Property addProperty(String name, Property property) {
		properties.put(name, property);
		return property;
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

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Template() {
		
	}
	
	public Template(String name) {
		setName(name);
	}
}
