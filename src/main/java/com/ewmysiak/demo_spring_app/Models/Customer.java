package com.ewmysiak.demo_spring_app.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "active")
    private boolean active;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.active = false;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + "]";
    }

    @Override
    public int hashCode() {
        int iDhashCode = id.hashCode();
        iDhashCode += 666 * name.hashCode();
        iDhashCode += 666 * age;
        if(active){
            iDhashCode += 666 * 10;
        }else{
            iDhashCode += 666 * 20;
        }

        return iDhashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!id.equals(customer.id)) return false;
        if (!name.equals(customer.name)) return false;
        if (!(age==customer.age)) return false;
        if (active!=(customer.active)) return false;
        return true;
    }

}