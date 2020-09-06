package org.kodluyoruz.trendyol.c.clasess.good;

import java.util.List;

public class Login {
    private String username;
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

    public List<String> getLoginIpAddress() {
        return loginIpAddress;
    }

    public void setLoginIpAddress(List<String> loginIpAddress) {
        this.loginIpAddress = loginIpAddress;
    }
}
