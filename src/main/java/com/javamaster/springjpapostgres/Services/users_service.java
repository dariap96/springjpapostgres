package com.javamaster.springjpapostgres.Services;
import com.javamaster.springjpapostgres.Entities.Users;
import com.javamaster.springjpapostgres.Repos.users_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class users_service {

    @Autowired
    private users_repo URepo;
    @Transactional
    public void UserService(users_repo URepo){
        this.URepo = URepo;
    }

    @Transactional
    public void createUsers(Users users) {
        URepo.save(users);
    }
    @Transactional
    public List<Users> findAll(){
        return URepo.findAll();
    }
    @Transactional
    public Users findById(Long userId){
        return URepo.findById(userId).orElse(null);
    }
    @Transactional
    public List<Users> findWhereEmailIsGmail(){
        return URepo.findWhereEmailIsGmail();
    }
    @Transactional
    public List<Users> findWhereNameStartsFromSmith(){
        return URepo.findWhereNameStartsFromSmith();
    }
}
