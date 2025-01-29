/**
 * @author Yuri Santos
 * @since 29-01-2025
 * @version 1.0
 */

package br.com.flexreserve.flex_reserve.controller;

import br.com.flexreserve.flex_reserve.entity.User;
import br.com.flexreserve.flex_reserve.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    List<User> create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping
    List<User> list(){
        return userService.list();
    }

    @PutMapping
    List<User> update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("{id}")
    List<User> delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }

}
