package org.axnaar.rptools.inventoryengine;

import java.util.LinkedList;
import java.util.List;

import org.axnaar.rptools.inventoryengine.entity.Template;
import org.axnaar.rptools.inventoryengine.entity.impl.Entity;
import org.axnaar.rptools.inventoryengine.entity.property.Property;

public class InventoryEngine {

	private List<Template> registredTemplates = new LinkedList<Template>();
	private List<Entity> registredEntities = new LinkedList<Entity>();
	
	
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
	
	public boolean registerEntity(Entity entity){
		return registredEntities.add(entity);
	}
	
	public boolean deleteEntity(Entity entity){
		return registredEntities.remove(entity);
	}
	
	public Entity constructBlankEntity(){
		Entity entity = new Entity();
		registerEntity(entity);
		return entity;
	}
	
	
}
