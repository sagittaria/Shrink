package kgroup.controller;

import kgroup.entity.User;
import kgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Collection<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable("id") String id) {
        return userService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Collection<User> deleteById(@PathVariable("id") String id) {
        return userService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<User> add(@RequestBody User user) {
        return userService.add(user);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<User> update(@RequestBody User user) {
        return userService.update(user);
    }
}