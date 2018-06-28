package io.github.JDSalisbury.ims;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImsRestController {

	@Resource
	private InventoryItemRepository itemRepo;

	// @RequestMapping(path = "/addItemPage", method = POST)
	// public String userFormProcessing(Model model, @RequestParam String barcode,
	// @RequestParam int quantity,
	// @RequestParam String expirationDateString, @RequestParam String itemName,
	// @RequestParam String unit,
	// @RequestParam String location, @RequestParam double price, @RequestParam
	// String description) {
	// model.addAttribute("itemsModel", itemRepo.findTop3ByOrderByIdDesc());
	//
	// LocalDate localDate = LocalDate.parse(expirationDateString);
	// InventoryItem item = new InventoryItem(barcode, quantity, localDate,
	// itemName, unit, location, price,
	// description);
	// itemRepo.save(item);
	//
	// return "redirect:/addItemPage";
	// }

}
