package com.javamaster.springjpapostgres.Repos;

import com.javamaster.springjpapostgres.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.email like '%@gmail.com%'")//если этого мало можно написать
        //собственный запрос на языке похожем на SQL
    List<User> findWhereEmailIsGmail();

    @Query(value = "select * from users where name like '%smith%'", nativeQuery = true)
        //если и этого мало - можно написать запрос на чистом SQL и все это будет работать
    List<User> findWhereNameStartsFromSmith();
}
