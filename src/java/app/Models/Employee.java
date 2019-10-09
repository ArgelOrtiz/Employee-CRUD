package app.Model;

import java.util.ArrayList;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String salary;
    private ArrayList<Employee> list;
    
    public Employee(){
    
    }

    public Employee(String id, String firstName, String lastName, String address, String phone, String salary, ArrayList<Employee> list) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }
}
    