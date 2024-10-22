package com.example.tpbase.model;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPUTER")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Marque")
    private String marque;
    @Column(name = "SerialNumber", length = 20, nullable = false)
    private String serialnumber;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getSerialnumber() {
        return serialnumber;
    }
    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }
    @Override
    public String toString() {
        return "Computer [id=" + id + ", marque=" + marque + ", serialnumber=" + serialnumber + "]";
    }

}
