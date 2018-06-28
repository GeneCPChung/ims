package io.github.JDSalisbury.ims;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IMSController {

	@Resource
	private InventoryItemRepository itemRepo;

	@RequestMapping("/mainPage")
	public String getMainPage(Model model) {
		model.addAttribute("itemsModel", itemRepo.findAllByOrderByDateAsc());
		return "index";
	}

	@RequestMapping("/addItemPage")
	public String lastAddedItem(Model model) {
		model.addAttribute("itemsModel", itemRepo.findTop3ByOrderByIdDesc());
		return "addItemPage";
	}

	// @RequestMapping("/add-Item-Form")
	// public String userFormProcessing(@RequestParam String barcode, @RequestParam
	// int quantity,
	// @RequestParam String expirationDateString, @RequestParam String itemName,
	// @RequestParam String unit,
	// @RequestParam String location, @RequestParam double price, @RequestParam
	// String description) {
	//
	// LocalDate localDate = LocalDate.parse(expirationDateString);
	// InventoryItem item = new InventoryItem(barcode, quantity, localDate,
	// itemName, unit, location, price,
	// description);
	// itemRepo.save(item);
	//
	// return "redirect:/addItemPage";
	// }

	@RequestMapping("/deleteItem")
	public String getDeletePage(Model model) {
		model.addAttribute("itemsModel", itemRepo.findAllByOrderByDateAsc());
		return "deleteItem";
	}

}
