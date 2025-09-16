package model;

import java.util.UUID;
public class User {
    private String UUid;
    private String fullName;
    private String email;
    private String password;
    private String role;

    public User(String UUid, String fullName, String email, String password, String role) {
        this.UUid = UUid;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUUid() {
        return UUid;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUUid(String UUid) {
        this.UUid = UUid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "UUid='" + UUid + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
