package br.com.zup.inventory.repository;

import br.com.zup.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRespository extends JpaRepository<Inventory, String> {

}
