package com.group.libraryapp.repository.fruit;

import com.group.libraryapp.dto.homework.request.FruitRequestDTO;
import com.group.libraryapp.dto.homework.request.FruitUpdateRequestDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class FruitMemoryRepository implements FruitRepository{
    private final JdbcTemplate jdbcTemplate;
    public FruitMemoryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void storeFruit(FruitRequestDTO request) {
        String sql = "INSERT INTO fruit(name, warehousingDate, price, state) VALUES(?,?,?,0)";
        jdbcTemplate.update(sql,request.getName(), request.getWarehousingDate(), request.getPrice());
    }

    public void updateFruit(FruitUpdateRequestDTO request) {
        String sql = "UPDATE fruit SET state=1 WHERE id = ?";
        jdbcTemplate.update(sql,request.getId());
    }


    public int getSalesAmountByName(String name) {
        String sql = "SELECT sum(price) FROM fruit WHERE state = 1 AND name= ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, Integer.class);
    }

    public int getNotSalesAmountByName(String name) {
        String sql = "SELECT sum(price) FROM fruit WHERE state = 0 AND name=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, Integer.class);
    }
}
