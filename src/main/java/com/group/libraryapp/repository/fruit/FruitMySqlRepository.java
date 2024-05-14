package com.group.libraryapp.repository.fruit;

import com.group.libraryapp.dto.homework.request.FruitRequestDTO;
import com.group.libraryapp.dto.homework.request.FruitUpdateRequestDTO;
import org.springframework.stereotype.Repository;

@Repository
public class FruitMySqlRepository implements FruitRepository{

    @Override
    public void storeFruit(FruitRequestDTO request) {

    }

    @Override
    public void updateFruit(FruitUpdateRequestDTO request) {

    }

    @Override
    public int getSalesAmountByName(String name) {
        return 0;
    }

    @Override
    public int getNotSalesAmountByName(String name) {
        return 0;
    }
}
