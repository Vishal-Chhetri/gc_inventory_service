/**
 * 
 */
package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.Item;

/**
 * @author Vishal Chhetri
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
