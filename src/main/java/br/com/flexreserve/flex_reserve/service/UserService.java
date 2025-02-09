/**
 * @author Yuri Santos
 * @since 29-01-2025
 * @version 1.0
 */

package br.com.flexreserve.flex_reserve.service;

import br.com.flexreserve.flex_reserve.entity.User;
import br.com.flexreserve.flex_reserve.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> create(User user) {
        userRepository.save(user);
        return list();
    }

    public List<User> list() {
        return userRepository.findAll();
    }

    public List<User> update(User user) {
        userRepository.save(user);
        return list();
    }
    public List<User> delete(Long id) {
        userRepository.deleteById(id);
        return list();
    }
}
