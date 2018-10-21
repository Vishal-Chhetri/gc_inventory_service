package com.computer.genuine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computer.genuine.model.Vendor;
import com.computer.genuine.service.VendorService;

/**
 * @author Vishal Chhetri
 *
 */
@RestController
@RequestMapping("/vendors")
public class VendorController {
	
	private VendorService vendorService;
	@Autowired
	public VendorController(VendorService vendorService) {
		this.vendorService=vendorService;
	}
	
	@GetMapping("/getAllVendors")
	public List<Vendor> getAllVendors(){
		return vendorService.getAllVendors();
	}	
	@GetMapping("/findVendorById/{user_id}")
	public Optional<Vendor> findById(@PathVariable Long user_id){
		return vendorService.findById(user_id);
	}
	@GetMapping("/findVendorByName/{vendorName}")
	public List<Vendor> findVendorByName(@PathVariable String vendorName){
		return vendorService.findByName(vendorName);
	}
	
	@PostMapping("/createVendor")
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorService.saveVendor(vendor);
	}
	@PostMapping("/createVendor")
	public List<Vendor> createUsers(@RequestBody List<Vendor> vendorList){
		return vendorService.saveVendors(vendorList);		
	}
	
	@PutMapping("/activateVendor/{user_id}")
	public void activateVendor(@PathVariable Long user_id) {
		vendorService.activateVendor(user_id);
	}
	@PutMapping("/deactivateVendor/{user_id}")
	public void deactivateVendor(@PathVariable Long user_id) {
		vendorService.deActivateVendor(user_id);
	}
		
	@DeleteMapping("/deleteVendor/{user_id}")
	public Optional<Vendor> deleteVendor(@PathVariable Long user_id) {
		vendorService.deleteVendor(user_id);
		return vendorService.findById(user_id);
	}
}
