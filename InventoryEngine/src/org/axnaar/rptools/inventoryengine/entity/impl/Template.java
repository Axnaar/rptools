package org.axnaar.rptools.inventoryengine.entity.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.Property;

public class Template implements org.axnaar.rptools.inventoryengine.entity.Template {

	
	Map<String, String> properties = new HashMap<String, String>(); 
	private String name = "Undefined";
	
	@Override
	public Map<String, String> getProperties() {
		return properties;
	}

	@Override
	public List<String> getPropertyNames() {
		List<String> result = new LinkedList<String>(properties.keySet()); 
		Collections.sort(result);
		return result;
	}



	@Override
	public String addProperty(String name, String property) {
		properties.put(name, property);
		return property;
	}

	@Override
	public String removeProperty(String name) {
		String property = properties.get(name);
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
	
	public List<String> buildPropsFromList(Map<String, String> props){
		List<String> notFound = new LinkedList<String>();
		for(String key : props.keySet()){
			Class<? extends Property> propType = PropertyFactory.getPropByType( props.get(key));
			if(propType != null)
				this.addProperty(key, props.get(key));
			else
				notFound.add(key);
		}
		
		return notFound;
		
	}
	
}
