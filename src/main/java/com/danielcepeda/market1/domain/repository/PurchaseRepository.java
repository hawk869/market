package com.danielcepeda.market1.domain.repository;

import com.danielcepeda.market1.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
//    Optional para controlar un cliente que no tenga compras
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
