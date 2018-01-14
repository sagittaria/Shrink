package kgroup.service.impl;

import kgroup.dao.UserDao;
import kgroup.entity.User;
import kgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Collection<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getById(String id) {
        return userDao.getById(id);
    }

    @Override
    public Collection<User> deleteById(String id) {
        return userDao.deleteById(id);
    }

    @Override
    public Collection<User> add(User user) {
        return userDao.add(user);
    }

    @Override
    public Collection<User> update(User user) {
        return userDao.update(user);
    }
}