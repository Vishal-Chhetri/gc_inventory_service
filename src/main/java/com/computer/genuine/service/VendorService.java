package com.computer.genuine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computer.genuine.model.Vendor;
import com.computer.genuine.repository.VendorRepository;

/**
 * @author Vishal Chhetri
 *
 */
@Service
public class VendorService {
	
	private VendorRepository vendorRepository;
	
	@Autowired
	public VendorService(VendorRepository vendorRepository) {
		this.vendorRepository = vendorRepository;
	}
	
	public List<Vendor> getAllVendors(){		
		return vendorRepository.findAll();
	}
	public Optional<Vendor> findById(Long id) {
		return vendorRepository.findById(id);
	}
	public List<Vendor> findByName(String name){
		return vendorRepository.findByName(name);
	}
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	public List<Vendor> saveVendors(List<Vendor> vendors){
		return vendorRepository.saveAll(vendors);
	}
	public void activateVendor(Long id) {
		vendorRepository.activateVendors(id);
	}
	public void deActivateVendor(Long id) {
		vendorRepository.deactivateVendors(id);
	}
	public void deleteVendor(Long id) {
		vendorRepository.deleteById(id);
	}
}
