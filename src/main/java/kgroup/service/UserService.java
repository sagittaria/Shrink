package kgroup.service;

import kgroup.entity.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAll();

    User getById(String id);

    Collection<User> deleteById(String id);

    Collection<User> add(User user);

    Collection<User> update(User user);
}
