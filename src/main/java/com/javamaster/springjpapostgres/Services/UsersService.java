package com.javamaster.springjpapostgres.Services;
import com.javamaster.springjpapostgres.Entities.User;
import com.javamaster.springjpapostgres.Repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/*
@Service
public class UsersService {

    @Autowired
    private UsersRepository URepo;
    @Transactional
    public void UserService(UsersRepository URepo){
        this.URepo = URepo;
    }

    @Transactional
    public void createUsers(User users) {
        URepo.save(users);
    }
    @Transactional
    public List<User> findAll(){
        return URepo.findAll();
    }
    @Transactional
    public User findById(Long userId){
        return URepo.findById(userId).orElse(null);
    }
    @Transactional
    public List<User> findWhereEmailIsGmail(){
        return URepo.findWhereEmailIsGmail();
    }
    @Transactional
    public List<User> findWhereNameStartsFromSmith(){
        return URepo.findWhereNameStartsFromSmith();
    }
}

 */
