package com.example.automotivepartsecommerceproject.entity;
import lombok.Getter;
@Getter
public enum Level {
    DEBUG( "debug"),/*"ticket.prio.urgent.label"localization ve farklı diller icin*/
    INFO("info"),
    WARNING("warning"),
    ERROR("error"),
    CRITICAL("critical");
    private String label;
    Level(String label) {
        this.label=label;
    }
}
