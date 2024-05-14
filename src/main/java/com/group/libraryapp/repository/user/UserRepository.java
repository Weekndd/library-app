package com.group.libraryapp.repository.user;

import com.group.libraryapp.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //함수의 이름이 중요하다
    //함수 이름만 작성하면, 알아서 SQL이 조립된다!
    //find라고 작성하면, 1개의 데이터만 가져온다.
    //By뒤에 붙는 필드 이름으로 SELECT 쿼리의 WHERE문이 작성된다.
    //
    Optional<User> findByName(String name);
}
