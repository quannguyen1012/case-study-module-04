package com.cg.model.dto;


import java.util.Set;

public class UserDto {
    private Long id;
    private Set<RoleDto> roles;
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String activated;
    private String rememberToken;

    public UserDto() {}

    public UserDto(Long id,Set<RoleDto> roles, String name, String username, String password, String email, String phone,
                   String address, String activated, String rememberToken) {
        this.id = id;
        this.roles = roles;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.activated = activated;
        this.rememberToken = rememberToken;
    }

    public UserDto(Set<RoleDto> roles, String name, String username, String password, String email,
                   String phone, String address, String activated, String rememberToken) {
        this.roles = roles;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.activated = activated;
        this.rememberToken = rememberToken;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Set<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDto> roles) {
        this.roles = roles;
    }
}
