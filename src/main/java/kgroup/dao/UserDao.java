package kgroup.dao;


import kgroup.entity.User;

import java.util.Collection;


public interface UserDao {

    Collection<User> getAll();

    User getById(String id);

    Collection<User> deleteById(String id);

    Collection<User> add(User user);

    Collection<User> update(User user);
}