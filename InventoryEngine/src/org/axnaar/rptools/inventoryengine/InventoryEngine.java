package org.axnaar.rptools.inventoryengine;

import java.util.LinkedList;
import java.util.List;

import org.axnaar.rptools.inventoryengine.entity.Template;
import org.axnaar.rptools.inventoryengine.entity.property.Property;

public class InventoryEngine {

	private List<Template> registredTemplates = new LinkedList<Template>();
	

	
	private boolean registerTemplate(Template template){
		if(registredTemplates.contains(template))
			return false;
		else{
			registredTemplates.add(template);
			return true;
		}
	}
	
	
	
	
	public List<Template> getRegistredTemplates(){
		return registredTemplates;
	}
	
	
	
	
	
}
