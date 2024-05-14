package com.group.libraryapp.service.fruit;

import com.group.libraryapp.dto.homework.request.FruitRequestDTO;
import com.group.libraryapp.dto.homework.request.FruitUpdateRequestDTO;
import com.group.libraryapp.dto.homework.response.FruitResponseDTO;
import com.group.libraryapp.repository.fruit.FruitMemoryRepository;
import com.group.libraryapp.repository.fruit.FruitRepository;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;
    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }


    public void storeFruit(FruitRequestDTO request) {
        fruitRepository.storeFruit(request);
    }

    public void updateFruit(FruitUpdateRequestDTO request) {
        fruitRepository.updateFruit(request);
    }

    public FruitResponseDTO getFruitAmount(String name) {
        int salesAmount = fruitRepository.getSalesAmountByName(name);
        int notSalesAmount = fruitRepository.getNotSalesAmountByName(name);
        return new FruitResponseDTO(salesAmount,notSalesAmount);
    }
}
