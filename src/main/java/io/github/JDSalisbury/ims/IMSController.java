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
}
