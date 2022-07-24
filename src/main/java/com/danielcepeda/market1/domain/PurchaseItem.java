package com.danielcepeda.market1.domain;

import lombok.Data;

@Data
public class PurchaseItem {

    private Integer productId;
    private Integer quantity;
    private Integer total;
    private boolean active;
}
