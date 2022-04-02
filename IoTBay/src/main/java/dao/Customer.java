/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author kingsleybyrne
 */
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    private String dateOfBirth;
    private String payementDetails; //needs to be an object of payment details
    private String paymentHistory;

    /**
     * @return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the payementDetails
     */
    public String getPayementDetails() {
        return payementDetails;
    }

    /**
     * @param payementDetails the payementDetails to set
     */
    public void setPayementDetails(String payementDetails) {
        this.payementDetails = payementDetails;
    }

    /**
     * @return the paymentHistory
     */
    public String getPaymentHistory() {
        return paymentHistory;
    }

    /**
     * @param paymentHistory the paymentHistory to set
     */
    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }
}
