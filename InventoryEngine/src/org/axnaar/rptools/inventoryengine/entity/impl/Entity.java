package org.axnaar.rptools.inventoryengine.entity.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.Property;

public class Entity {

	private Map<String, Property> properties = new HashMap<String, Property>();	
	private Template template;
	
	public Entity(){
		
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public Map<String, Property> getProperties() {
		return properties;
	}

	public Entity(Template template) {
		super();
		this.template = template;
		for(String prop : template.getPropertyNames()){
			properties.put(prop, null);
		}
	}
	
	public Property getPropertyByName(String name){
		return properties.get(name);
	}
	
	public boolean setPropertyByName(String name, String val){
		if(!properties.containsKey(name))
			return false;
		properties.get(name).setValue(val);
		return true;
	}
	
	public void addProperty(String name, String type){
		Property newProp =  PropertyFactory.constructBlankPropertyByType(type);
		
		if(newProp != null )
			properties.put(name, newProp);
	}
	
	public void addProperty(String name, String type, String value){
		Property newProp =  PropertyFactory.constructPropertyByType(type, value);
		
		if(newProp != null )
			properties.put(name, newProp);
	}
	
	
	public Property removePropertyByName(String name){
			return properties.remove(name);
	}
	
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		String endl = System.getProperty("line.separator");
		stringBuilder.append("-----" + endl + 
							"Entity dump :" + endl);
		
		for(String key : this.properties.keySet()) 
			stringBuilder.append(">>["+key+"] : " +this.properties.get(key) + endl);
		
		stringBuilder.append("-----" + endl );
		return stringBuilder.toString();
	}
	
}
