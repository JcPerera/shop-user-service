package com.shop.userservice.dto;

public class UserResponseDto {
    private String id;
    private String username;
    private String email;
    private boolean isAdmin;
    private String img;

    public UserResponseDto(String id, String username, String email, boolean isAdmin, String img) {
        this.id = id;
        this.username = username;
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
                + ",                         \"email\":\"" + email + "\""
                + ",                         \"isAdmin\":\"" + isAdmin + "\""
                + ",                         \"img\":\"" + img + "\""
                + "}";
    }
}
