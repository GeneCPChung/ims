package io.github.JDSalisbury.ims;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemPopulator implements CommandLineRunner {

	@Resource
	InventoryItemRepository itemRepo;

	@SuppressWarnings("unused")
	@Override
	public void run(String... args) throws Exception {
		InventoryItem testItem1 = itemRepo
				.save(new InventoryItem("1234E", 5, "06/07/2018", "Apple", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem2 = itemRepo
				.save(new InventoryItem("1234E", 5, "06/07/2018", "Banana", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem3 = itemRepo
				.save(new InventoryItem("1234E", 5, "06/07/2018", "Orange", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem4 = itemRepo
				.save(new InventoryItem("1234E", 5, "06/07/2018", "Grape", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem5 = itemRepo
				.save(new InventoryItem("1234E", 5, "06/07/2018", "Plum", "EACH", "Aisle 10", .59, "Granny Smith"));

	}

}
