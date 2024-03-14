package com.arminik.nm.admin.service;

import com.arminik.nm.admin.models.ResponseUser;
import com.arminik.nm.admin.models.User;
import com.arminik.nm.admin.repo.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        log.info("loaded");
        return userRepository.findAll();
    }

    public ResponseUser addNewUser(User user) {
        log.info("id: {}, userName: {}", user.getId(), user.getNickname());
        userRepository.save(user);
        return ResponseUser.builder()
                .id(user.getId())
                .userName(user.getLastname() + " " + user.getFirstname())
                .build();
    }

    public User findUserByNickname(String nickName) {
        log.info("start finding {}", nickName);
       return  userRepository.findByNickName(nickName);
    }

    public ResponseUser deleteUserByLogin(String login) {
        log.info("delete user by login: {}", login);
        userRepository.delete(login);
        return ResponseUser.builder().
                userName(login).
                build();
    }

}
