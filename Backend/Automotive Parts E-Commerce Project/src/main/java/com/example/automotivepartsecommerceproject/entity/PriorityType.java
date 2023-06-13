package com.example.automotivepartsecommerceproject.entity;

import lombok.Getter;

@Getter
public enum PriorityType {
    URGENT( "Acil"),/*"ticket.prio.urgent.label"localization ve farklı diller icin*/
    LOW("Dusuk Oncelikli"),
    HIGH("Yuksek Oncelikli");
    private String label;

    PriorityType(String label) {
        this.label=label;
    }

}

