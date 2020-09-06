package org.kodluyoruz.trendyol.c.clasess.bad;

import java.util.Date;
import java.util.List;

public class UserSuperClass {

    private String nickname;
    private String username;
    private String name;
    private String surname;
    private String phone;
    private Date dateOfBirth;
    private String email;

    private List<String> comments;

    private List<String> friends;

    private boolean isNewUser;
    private boolean isSuperUser;
    private boolean isAdmin;

    private int loginCount;
    private int resetPasswordCount;
    private boolean isBlocked;
    private List<String> loginIpAddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public boolean isNewUser() {
        return isNewUser;
    }

    public void setNewUser(boolean newUser) {
        isNewUser = newUser;
    }

    public boolean isSuperUser() {
        return isSuperUser;
    }

    public void setSuperUser(boolean superUser) {
        isSuperUser = superUser;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getResetPasswordCount() {
        return resetPasswordCount;
    }

    public void setResetPasswordCount(int resetPasswordCount) {
        this.resetPasswordCount = resetPasswordCount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getLoginIpAddress() {
        return loginIpAddress;
    }

    public void setLoginIpAddress(List<String> loginIpAddress) {
        this.loginIpAddress = loginIpAddress;
    }
}
