package org.axnaar.rptools.inventoryengine.entity.impl;

import java.util.HashMap;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.LongProperty;
import org.axnaar.rptools.inventoryengine.entity.property.Property;
import org.axnaar.rptools.inventoryengine.entity.property.StringProperty;

public class PropertyFactory {
	public static final String Numeric = "Numeric";
	public static final String String = "String";
	public static Map<String, Class<? extends Property>> Types;
	static{
		Types = new HashMap<String, Class<? extends Property>>();
		Types.put(Numeric, LongProperty.class);
		Types.put(String, StringProperty.class);
		
	}

	public static Class<? extends Property> getPropByType(String name){
		return Types.get(name);
	}
	
	public static Property constructBlankPropertyByType(String name){
		if(!Types.containsKey(name))
			return null;
		try {
			Class<? extends Property> clazz = Types.get(name);
			
			return clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public static Property constructPropertyByType(String name, String value){
		Property property =  constructBlankPropertyByType( name);
		if(property != null){
			property.setValue(value);
			return property;
		}
		return null;
	}
	
	
}
