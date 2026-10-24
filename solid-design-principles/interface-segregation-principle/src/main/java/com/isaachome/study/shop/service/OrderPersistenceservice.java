package com.isaachome.study.shop.service;

import com.isaachome.study.shop.entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderPersistenceservice implements PersistenceService<Order>{

    private static final Map<Long, Order> ORDER_STORAGE = new HashMap<>();
    @Override
    public void save(Order entity) {
         synchronized(ORDER_STORAGE) {
             ORDER_STORAGE.put(entity.getId(), entity);
         }
    }

    @Override
    public void delete(Order entity) {
     synchronized(ORDER_STORAGE) {
         ORDER_STORAGE.remove(entity.getId());
     }
    }

    @Override
    public Order findById(Long id) {
         synchronized(ORDER_STORAGE) {
            return ORDER_STORAGE.get(id);
        }
    }
}
