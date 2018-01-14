package kgroup.dao.impl;

import kgroup.dao.UserDao;
import kgroup.entity.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("userDAO")
public class UserDaoImpl implements UserDao {

    @Override
    public Collection<User> getAll() {
        return null;
    }

    @Override
    public User getById(String id) {
        return null;
    }

    @Override
    public Collection<User> deleteById(String id) {
        return null;
    }

    @Override
    public Collection<User> add(User user) {
        return null;
    }

    @Override
    public Collection<User> update(User user) {
        return null;
    }

}
