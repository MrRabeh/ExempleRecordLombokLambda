package com.exempleRecord.lombok.model;

import lombok.Builder;

@Builder
public record Product(
        String name,
        double price,
        int quantity) {
}
