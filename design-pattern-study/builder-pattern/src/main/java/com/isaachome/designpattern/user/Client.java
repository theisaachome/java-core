package com.isaachome.designpattern.user;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	 static void main(String[] args) {
	  var user = createUser();
	  var userDtoBuilder = new UserWebDTOBuilder();
	  var dto =directBuild(userDtoBuilder, user);
	  System.out.println(dto);
	}

	private static UserDTO directBuild(UserDTOBuilder builder,User user){
		 builder.withFirstName(user.getFirstName())
				 .withLastName(user.getLastName())
				 .withBirthday(user.getBirthday())
				 .withAddress(user.getAddress());
		 return builder.build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
