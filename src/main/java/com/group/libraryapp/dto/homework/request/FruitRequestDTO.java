package com.group.libraryapp.dto.homework.request;

import java.time.LocalDate;

public class FruitRequestDTO {
    String name;
    LocalDate warehousingDate;
    long price;

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public long getPrice() {
        return price;
    }
}
