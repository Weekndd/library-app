package com.group.libraryapp.repository.fruit;

import com.group.libraryapp.dto.homework.request.FruitRequestDTO;
import com.group.libraryapp.dto.homework.request.FruitUpdateRequestDTO;

public interface FruitRepository {
    void storeFruit(FruitRequestDTO request);

    void updateFruit(FruitUpdateRequestDTO request);

    int getSalesAmountByName(String name);

    int getNotSalesAmountByName(String name);
}
