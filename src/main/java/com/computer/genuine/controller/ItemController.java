/**
 * 
 */
package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.Item;
import com.computer.genuine.service.ItemService;

/**
 * @author Vishal Chhetri
 *
 */
@RestController
@RequestMapping("/item")
public class ItemController {
	
	private ItemService itemService;	
	
	public ItemController(ItemService itemService) {
		this.itemService=itemService;
	}
	
	@GetMapping("/getAllItems")
	public List<Item> getAllItems(){
		List<Item> items = itemService.findAllItems();		
		return items;
	}
	@GetMapping("/getItemById/{itemId}")
	public Optional<Item> getItemById(@PathVariable Long itemId){
		return itemService.findById(itemId);
	}
	@PostMapping("/saveItem")
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	@PostMapping("/saveItems")
	public List<Item> saveItems(@RequestBody List<Item> items){
		return itemService.saveItems(items);
	}
}
