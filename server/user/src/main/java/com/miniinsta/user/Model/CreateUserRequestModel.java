package com.miniinsta.user.Model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
public class CreateUserRequestModel {
    @NotNull(message = "First Name can't be empty")

    private String firstName;
    @NotNull(message = "Last Name can't be empty")
    private String lastName;
    @NotNull(message = "Email can't be empty")
    @Email(message = "Please enter valid email")
    private String email;
    @NotNull(message = "Password can't be empty")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
