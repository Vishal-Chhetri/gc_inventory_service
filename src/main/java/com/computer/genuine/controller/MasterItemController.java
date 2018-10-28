package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.MasterItem;
import com.computer.genuine.service.MasterItemService;

/**
 * @author Vishal Chhetri
 *
 */
@RestController
@RequestMapping("/masterItem")
public class MasterItemController {

	private MasterItemService masterItemService;
	public MasterItemController(MasterItemService masterItemService) {
		this.masterItemService=masterItemService;
	}
	
	@GetMapping("/getAllMasterItem")
	public List<MasterItem> getAllMasterItem(){
		return masterItemService.findAllMasterItems();
	}
	@GetMapping("/getMasterItemById/{id}")
	public Optional<MasterItem> getMasterItemById(@PathVariable Long id){
		return masterItemService.findById(id);
	}
	@GetMapping("/getMasterItemByBrandName/{brandName}")
	public List<MasterItem> getMasterItemByBrandName(@PathVariable String brandName){
		return masterItemService.findByBrandName(brandName);
	}
	@PostMapping("/saveMasterItem")
	public MasterItem saveMasterItem(@RequestBody MasterItem masterItem) {
		return masterItemService.saveMasterItem(masterItem);
	}
	@PostMapping("/saveMasterItems")
	public List<MasterItem> saveMasterItems(@RequestBody List<MasterItem> masterItems) {
		return masterItemService.saveMasterItems(masterItems);
	}
}
