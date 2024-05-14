package com.group.libraryapp.controller.fruit;

import com.group.libraryapp.dto.homework.request.FruitRequestDTO;
import com.group.libraryapp.dto.homework.request.FruitUpdateRequestDTO;
import com.group.libraryapp.dto.homework.response.FruitResponseDTO;
import com.group.libraryapp.service.fruit.FruitService;
import org.springframework.web.bind.annotation.*;

@RestController
public class FruitController {
    private final FruitService fruitService;
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public void storeFruit(@RequestBody FruitRequestDTO request) {
        fruitService.storeFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public void updateFruit(@RequestBody FruitUpdateRequestDTO request) {
        fruitService.updateFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public FruitResponseDTO getFruitAmount(@RequestParam String name) {
        return fruitService.getFruitAmount(name);
    }
}
