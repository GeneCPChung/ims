package io.github.JDSalisbury.ims;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public class InventoryItemRepository implements CrudRepository<InventoryItem, Long> {

	@Override
	public <S extends InventoryItem> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends InventoryItem> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<InventoryItem> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<InventoryItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<InventoryItem> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(InventoryItem entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends InventoryItem> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
