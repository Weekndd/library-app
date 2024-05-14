package com.group.libraryapp.dto.homework.response;

public class FruitResponseDTO {
    long salesAmount;
    long notSalesAmount;

    public long getSalesAmount() {
        return salesAmount;
    }

    public long getNotSalesAmount() {
        return notSalesAmount;
    }

    public FruitResponseDTO(long salesAmount, long notSalesAmount) {
        this.salesAmount = salesAmount;
        this.notSalesAmount = notSalesAmount;
    }
}
