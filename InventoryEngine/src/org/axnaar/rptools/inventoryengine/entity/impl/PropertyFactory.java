package org.axnaar.rptools.inventoryengine.entity.impl;

import java.util.HashMap;
import java.util.Map;

import org.axnaar.rptools.inventoryengine.entity.property.LongProperty;
import org.axnaar.rptools.inventoryengine.entity.property.StringProperty;

public class PropertyFactory {
	public static final String Numeric = "Numeric";
	public static final String String = "String";
	public static final Map<String, Class> Types = new HashMap<String, Class>();
	static{
		Types.put(Numeric, LongProperty.class);
		Types.put(String, StringProperty.class);
	}

	
}
