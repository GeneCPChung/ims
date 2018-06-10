package io.github.JDSalisbury.ims;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemPopulator implements CommandLineRunner {

	private LocalDate date1 = LocalDate.of(2019, 11, 9);
	private LocalDate date2 = LocalDate.of(2018, 7, 5);
	private LocalDate date3 = LocalDate.of(2018, 6, 3);
	private LocalDate date4 = LocalDate.of(2018, 6, 2);
	private LocalDate date5 = LocalDate.of(2018, 6, 1);

	@Resource
	InventoryItemRepository itemRepo;

	@SuppressWarnings("unused")
	@Override
	public void run(String... args) throws Exception {
		InventoryItem testItem1 = itemRepo
				.save(new InventoryItem("1234E", 5, date1, "Apple", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem2 = itemRepo
				.save(new InventoryItem("1234E", 5, date2, "Banana", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem3 = itemRepo
				.save(new InventoryItem("1234E", 5, date3, "Orange", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem4 = itemRepo
				.save(new InventoryItem("1234E", 5, date4, "Grape", "EACH", "Aisle 10", .59, "Granny Smith"));
		InventoryItem testItem5 = itemRepo
				.save(new InventoryItem("1234E", 5, date5, "Plum", "EACH", "Aisle 10", .59, "Granny Smith"));

	}

}
