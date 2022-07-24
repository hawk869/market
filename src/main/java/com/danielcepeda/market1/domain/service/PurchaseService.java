package com.danielcepeda.market1.domain.service;

import com.danielcepeda.market1.domain.Purchase;
import com.danielcepeda.market1.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
    public Optional<List<Purchase>> getByClient (String clientId){
        return purchaseRepository.getByClient(clientId);
    }
}
