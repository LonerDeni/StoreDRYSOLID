package Test;

import java.util.Date;

public class Buyer {
    private String name;
    private String lastName;
    private Date birthDay;
    private boolean sex;
    private double wallet;
    private String status;

    public Buyer(String name, String lastName, Date birthDay, boolean sex) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public boolean isSex() {
        return sex;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusOrder() {
        return status;
    }
}