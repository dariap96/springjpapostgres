package com.javamaster.springjpapostgres.Services;
import com.javamaster.springjpapostgres.Entities.Address;
import com.javamaster.springjpapostgres.Repos.address_repo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class address_service {
    @Autowired
    private address_repo addressRepository;
    @Transactional
    public void AddressService(address_repo addressRepository){
        this.addressRepository = addressRepository;
    }
    @Transactional
    public void addAddress(Address address){
        addressRepository.save(address);
    }

}
