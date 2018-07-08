package io.github.JDSalisbury.ims;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImsRestController {

	@Resource
	private InventoryItemRepository itemRepo;

	@RequestMapping(path = "/addTheItem/{barcode}/{quantity}/{expirationDateString}/{itemName}/{unit}/{location}/{price}/{description}", method = POST)
	public void userFormProcessing(@PathVariable String barcode, @PathVariable int quantity,
			@PathVariable String expirationDateString, @PathVariable String itemName, @PathVariable String unit,
			@PathVariable String location, @PathVariable double price, @PathVariable String description) {
		LocalDate localDate = LocalDate.parse(expirationDateString);
		InventoryItem item = new InventoryItem(barcode, quantity, localDate, itemName, unit, location, price,
				description);
		itemRepo.save(item);
	}

	@RequestMapping(path = "/deleteTheItem/{itemId}", method = DELETE)
	public void userFormDeleting(@PathVariable long itemId) {
		itemRepo.deleteById(itemId);
	}

	@RequestMapping(path = "/editTheItem/{id}/{barcode}/{quantity}/{expirationDateString}/{itemName}/{unit}/{location}/{price}/{description}", method = PUT)
	public void editFormProcessing(@PathVariable long id, @PathVariable String barcode, @PathVariable int quantity,
			@PathVariable String expirationDateString, @PathVariable String itemName, @PathVariable String unit,
			@PathVariable String location, @PathVariable double price, @PathVariable String description) {
		LocalDate localDate = LocalDate.parse(expirationDateString);
		InventoryItem editItem = itemRepo.findById(id).orElse(null);

		if (barcode != null)
			editItem.setBarcode(barcode);
		if (expirationDateString != null)
			editItem.setDate(localDate);
		if (description != null)
			editItem.setDescription(description);
		if (location != null)
			editItem.setLocation(location);
		if (itemName != null)
			editItem.setName(itemName);
		if (price != 0)
			editItem.setPrice(price);
		if (quantity != 0)
			editItem.setQuantity(quantity);
		if (unit != null)
			editItem.setUnit(unit);

		itemRepo.save(editItem);

	}

}
