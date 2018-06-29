package io.github.JDSalisbury.ims;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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
		// itemRepo.save(item);
		itemRepo.save(item);
	}

	@RequestMapping(path = "/deleteTheItem/{itemId}", method = DELETE)
	public void userFormDeleting(@PathVariable long itemId) {
		itemRepo.deleteById(itemId);
	}

}
