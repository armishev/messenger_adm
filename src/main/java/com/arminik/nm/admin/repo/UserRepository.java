package com.arminik.nm.admin.repo;

import com.arminik.nm.admin.models.ResponseUser;
import com.arminik.nm.admin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    @Override
    <S extends User> S save(S entity);
}
