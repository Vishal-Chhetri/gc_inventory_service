package com.computer.genuine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.MasterItem;

/**
 * @author Vishal Chhetri
 *
 */
@Repository
public interface MasterItemRepository extends JpaRepository<MasterItem, Long>{
	@Query("select masterItems from MasterItem masterItems where brand =:brandName")
	public List<MasterItem> findMasterItemByBrandName(String brandName);

}
