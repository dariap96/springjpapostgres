package com.javamaster.springjpapostgres.Repos;
import com.javamaster.springjpapostgres.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
