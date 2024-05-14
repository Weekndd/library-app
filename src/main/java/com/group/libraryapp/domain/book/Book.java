package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

//  @Column(nullable = false, length = 255, name="name")
//  name = "name" DB의 이름과 일치하기 때문에 생략가능
//  length = 255 DB의 크기를 255 기본값으로 맞췄기 때문에 생략가능
    @Column(nullable = false)
    private String name;

    protected Book() {

    }

    public Book(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.",name));
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
