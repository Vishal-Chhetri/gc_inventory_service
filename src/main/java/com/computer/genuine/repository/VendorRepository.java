package com.computer.genuine.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.Vendor;

/**
 * @author Vishal Chhetri
 *
 */
@Repository
@Transactional
public interface VendorRepository extends JpaRepository<Vendor, Long> {
	
	public List<Vendor> findByName(final String name);
	
	@Modifying
	@Query("update Vendor set status = 1 where user_id =:user_id")
	public void activateVendors(@Param("user_id") Long user_id);
	
	@Modifying
	@Query("update Vendor set status = 0 where user_id =:user_id")
	public void deactivateVendors(@Param("user_id") Long user_id);
	
	@Modifying
	@Query("delete from Vendor where user_id =:user_id")
	public void deleteVendor(@Param("user_id") Long id);
}
