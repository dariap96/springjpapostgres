package com.javamaster.springjpapostgres.Controllers;

import com.javamaster.springjpapostgres.Entities.Address;
import com.javamaster.springjpapostgres.Repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost4200")
public class AddressController {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("/address")
    public List<Address> getAddresses() {
        return (List<Address>) addressRepository.findAll();
    }

    @PostMapping("/address")
    void addAddress(@RequestBody Address address) {
        addressRepository.save(address);
    }
}
