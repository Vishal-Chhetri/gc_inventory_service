/**
 * 
 */
package com.computer.genuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.Item;
import com.computer.genuine.repository.ItemRepository;

/**
 * @author Vishal
 *
 */
@Service
public class ItemService {

	private ItemRepository itemRepository;	
	
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository=itemRepository;
	}
	
	public List<Item> findAllItems(){
		return itemRepository.findAll();
	}
	public Optional<Item> findById(Long id){
		return itemRepository.findById(id);
	}
	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}
	public List<Item> saveItems(List<Item> items){
		return itemRepository.saveAll(items);
	}
}
