package com.springApp.springMVC.proj.validationForms.beans;

import com.springApp.springMVC.proj.validationForms.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be minimum 2 symbols")
    private String name;
    //@NotEmpty(message = "surname can't be empty")  - если поставить пробелы то не срабатывает
    @NotBlank(message = "surname can't be empty") // - даже если поставить пробелы работает проверка
    private String surname;
    @Min(value = 200 , message = "must be more than 199")
    @Max(value = 5000, message = "must be less than 5001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> langMap;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put( "IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Opel", "Opel");
        carBrands.put("Mazda", "Mazda");

        langMap = new HashMap<>();
        langMap.put("EN", "English");
        langMap.put("DE", "Deutch");
        langMap.put("FR", "French");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLangMap() {
        return langMap;
    }

    public void setLangMap(Map<String, String> langMap) {
        this.langMap = langMap;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
