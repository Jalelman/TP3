package com.example.tpbase.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "First_Name", length = 250, nullable = false)
    private String firstname;
    @Column(name = "Last_Name", length = 250, nullable = false)
    private String lastname;
    public int getId() {
        return id;
    }
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COMPUTER_ID", referencedColumnName="id")
    private Computer computer;
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstname=" + firstname
                + ", lastname=" + lastname + "]";
    }

}
