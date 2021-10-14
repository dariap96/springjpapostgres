package com.javamaster.springjpapostgres.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*; //джава объекты в бд JPA

@Entity
@Table(name = "users")
public class User {

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.address = null;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @JsonIgnore //If u'll remove it you'll get json serialazer exeption
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
