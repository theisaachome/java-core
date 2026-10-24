package com.isaachome.designpattern.user;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstname;
    private String lastname;
    private String age;
    private LocalDate birthday;
    private String address;
    private UserDTO userDTO;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYear = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYear.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
      this.address = address.getHouseNumber() + " " + address.getStreet() + " " + address.getCity();

        return this;
    }

    @Override
    public UserDTO build() {
       return new UserWebDTO(firstname+" " + lastname, address, age);
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userDTO;
    }
}
