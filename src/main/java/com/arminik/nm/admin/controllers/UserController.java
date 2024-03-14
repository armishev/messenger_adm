package com.arminik.nm.admin.controllers;

import com.arminik.nm.admin.models.ResponseUser;
import com.arminik.nm.admin.models.User;
import com.arminik.nm.admin.models.dto.UserDto;
import com.arminik.nm.admin.repo.UserRepository;
import com.arminik.nm.admin.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/adm/v1")
public class UserController {

    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> get(){
      return userService.getAllUsers();
    }
    @PostMapping("/addNewUser")
    public ResponseUser addNewUser(@RequestBody User user) {
        log.info("id: {}, userName: {}", user.getId(), user.getNickname());
        return userService.addNewUser(user);
    }

    @PatchMapping("/findUserByLogin")
    public User findUserByLogin(@RequestBody UserDto userDto) {
        return userService.findUserByNickname(userDto.getNickname());
    }

    @DeleteMapping("/deleteUserByLogin")
    public ResponseUser deleteUserByLogin(@RequestBody UserDto userDto) {
        return userService.deleteUserByLogin(userDto.getNickname());
    }

}
