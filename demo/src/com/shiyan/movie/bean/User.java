package com.shiyan.movie.bean;

public class User {
    private String loginName;
    private String userName;
    private String password;
    private String phone;
    private char sex;
    private double money;

    public User() {

    }

    public User(String loginName, String userName, String password, String phone, char sex, double money) {
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.money = money;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
