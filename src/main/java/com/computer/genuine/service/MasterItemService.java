package com.computer.genuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.computer.genuine.model.MasterItem;
import com.computer.genuine.repository.MasterItemRepository;

/**
 * @author Vishal Chhetri
 *
 */
@Service
public class MasterItemService {
	private MasterItemRepository masterItemRepository;
	
	public MasterItemService(MasterItemRepository masterItemRepository) {
		this.masterItemRepository = masterItemRepository;
	}
	
	public List<MasterItem> findAllMasterItems(){
		return masterItemRepository.findAll();
	}
	public Optional<MasterItem> findById(long id) {
		return masterItemRepository.findById(id);
	}
	public List<MasterItem> findByBrandName(String brandName){
		return masterItemRepository.findMasterItemByBrandName(brandName);
	}
	public MasterItem saveMasterItem(MasterItem masterItem) {
		return masterItemRepository.save(masterItem);
	}
	public List<MasterItem> saveMasterItems(List<MasterItem> masterItems) {
		return masterItemRepository.saveAll(masterItems);
	}
}
