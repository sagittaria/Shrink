package kgroup.service;

import kgroup.entity.User;

import java.util.Collection;

public interface UserService {
    
    public Collection<User> getAll();

    public User getById(String id);
    
    public Collection<User> deleteById(String id);
    
    public Collection<User> add(User user);
    
    public Collection<User> update(User user);
}
