package com.javamaster.springjpapostgres.Services;
import com.javamaster.springjpapostgres.Entities.Address;
import com.javamaster.springjpapostgres.Repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/*
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Transactional
    public void AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Transactional
    public void addAddress(Address address){
        addressRepository.save(address);
    }

}
*/