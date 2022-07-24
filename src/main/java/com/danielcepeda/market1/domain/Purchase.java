package com.danielcepeda.market1.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Purchase {

    private Integer purchaseID;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> items;
}
