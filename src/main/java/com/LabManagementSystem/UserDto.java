package com.LabManagementSystem;

public class UserDto
{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // Getter and Setter methods start here
    // id
    public void setID(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

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