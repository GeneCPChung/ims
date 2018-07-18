package io.github.JDSalisbury.ims;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InventoryItemRepository extends CrudRepository<InventoryItem, Long> {

	List<InventoryItem> findAllByOrderByDateAsc();

	List<InventoryItem> findTop3ByOrderByIdDesc();

	List<InventoryItem> findAllByBarcode(String barcode);

}
