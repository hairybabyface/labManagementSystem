package com.LabManagementSystem;

public class UserDto
{
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserDto()
    {
        
    }

    // Constructor
    public UserDto(String firstName, String lastName, String email, String password) {
		
        super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

    // Getter and Setter methods start here
    // ...
    // firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    // lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    // email
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    // password
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
}