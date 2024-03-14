package com.arminik.nm.admin.repo;

import com.arminik.nm.admin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    @Override
    <S extends User> S save(S entity);
    @Query(value = "SELECT * FROM users WHERE nickname = :login", nativeQuery = true)
    User findByNickName(@Param("login") String nickName);

    @Query(value = "DELETE FROM users WHERE nickname = :login", nativeQuery = true)
    void delete(@Param("login") String nickName);
}
