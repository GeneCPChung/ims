package io.github.JDSalisbury.ims;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.Test;

public class InventoryItemTest {

	private LocalDate date = LocalDate.of(2018, 7, 6);

	@Test
	public void shouldReturnItemName() {
		InventoryItem underTest = new InventoryItem("1234E", 5, date, "Apple", "EACH", "Aisle 10", .59, "Granny Smith");

		String itemName = underTest.getName();

		assertThat(itemName, is("Apple"));
	}
}
