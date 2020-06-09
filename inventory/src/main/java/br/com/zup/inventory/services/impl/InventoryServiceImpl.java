package br.com.zup.inventory.services.impl;

import br.com.zup.inventory.entity.Inventory;
import br.com.zup.inventory.entity.Reserve;
import br.com.zup.inventory.event.BookedEvent;
import br.com.zup.inventory.event.OrderCreatedEvent;
import br.com.zup.inventory.repository.InventoryRespository;
import br.com.zup.inventory.repository.ReserveRepository;
import br.com.zup.inventory.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

    private InventoryRespository inventoryRespository;
    private ReserveRepository reserveRepository;

    @Autowired
    private KafkaTemplate<String, BookedEvent> template;

    @Autowired
    public InventoryServiceImpl(InventoryRespository inventoryRespository, ReserveRepository reserveRepository, KafkaTemplate<String, BookedEvent> template) {
        this.inventoryRespository = inventoryRespository;
        this.reserveRepository = reserveRepository;
        this.template = template;
    }

    //TODO: Implementar processamento do evento de Ordem Criada
    public void process(OrderCreatedEvent orderCreatedEvent){

    }
}
