package com.shop.userservice.dto;

public class UserDto {
    private String id;
    private String username;
    private String password;
    private String email;
    private boolean isAdmin;
    private String img;

    public UserDto(String id, String username, String password, String email, boolean isAdmin, String img) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"username\":\"" + username + "\""
                + ",                         \"password\":\"" + password + "\""
                + ",                         \"email\":\"" + email + "\""
                + ",                         \"isAdmin\":\"" + isAdmin + "\""
                + ",                         \"img\":\"" + img + "\""
                + "}";
    }
}
