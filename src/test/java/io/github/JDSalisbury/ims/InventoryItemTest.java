package io.github.JDSalisbury.ims;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class InventoryItemTest {

	@Test
	public void shouldReturnItemName() {
		InventoryItem underTest = new InventoryItem("1234E", 5, "06/07/2018", "Apple", "EACH", "Aisle 10", .59,
				"Granny Smith");

		String itemName = underTest.getName();

		assertThat(itemName, is("Apple"));
	}
}
