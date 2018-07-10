package io.github.JDSalisbury.ims;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IMSController {

	@Resource
	private InventoryItemRepository itemRepo;

	@RequestMapping("/")
	public String getMainPage(Model model) {
		model.addAttribute("itemsModel", itemRepo.findAllByOrderByDateAsc());
		return "index";
	}

	@RequestMapping("/addItemPage")
	public String lastAddedItem(Model model) {
		model.addAttribute("itemsModel", itemRepo.findTop3ByOrderByIdDesc());
		return "addItemPage";
	}

	@RequestMapping("/item/{id}")
	public String editItems(@PathVariable long id, Model model) {
		model.addAttribute("editModel", itemRepo.findById(id).orElse(null));
		return "item";
	}

	@RequestMapping("/deleteItem")
	public String getDeletePage(Model model) {
		model.addAttribute("itemsModel", itemRepo.findAllByOrderByDateAsc());
		return "deleteItem";
	}

}
