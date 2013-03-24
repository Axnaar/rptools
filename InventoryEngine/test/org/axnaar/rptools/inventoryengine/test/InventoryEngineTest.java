package org.axnaar.rptools.inventoryengine.test;

import static org.junit.Assert.*;

import org.axnaar.rptools.inventoryengine.InventoryEngine;
import org.axnaar.rptools.inventoryengine.entity.impl.Entity;
import org.axnaar.rptools.inventoryengine.entity.impl.PropertyFactory;
import org.junit.Test;

public class InventoryEngineTest {

	@Test
	public void test() {
		InventoryEngine engine = new InventoryEngine();
		
		Entity entity = new Entity();
		assertEquals(PropertyFactory.Types.keySet().size(), 2);
		
		//PropertyFactory.constructBlankPropertyByType(PropertyFactory.String);
		
		entity.addProperty("Name",  PropertyFactory.String, "Rusty Sword");
		entity.addProperty("Weight",  PropertyFactory.Numeric);
		entity.setPropertyByName("Weight", "5778");
		
		assertEquals(entity.getPropertyByName("Name").getValue(),"Rusty Sword");
		assertEquals(entity.getPropertyByName("Weight").getValue(),"5778");
				
		entity.setPropertyByName("Name", "Shining Sword");
		assertEquals(entity.getPropertyByName("Name").getValue(),"Shining Sword");
		
		
		assertEquals(entity.getProperties().keySet().size(), 2);
		System.out.println(entity.toString());
		
		engine.registerEntity(entity);
		assertEquals(engine.deleteEntity(entity), true);
		
		entity.removePropertyByName("Name");
		assertNull(entity.removePropertyByName("Name"));

		assertEquals(entity.getProperties().keySet().size(), 1);
		System.out.println(entity.toString());
	}

}
