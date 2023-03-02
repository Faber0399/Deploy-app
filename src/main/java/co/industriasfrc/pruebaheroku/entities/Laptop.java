package co.industriasfrc.pruebaheroku.entities;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String model;
    private String os;
    private String computer_line;
    private String inventary;
    private Boolean type_import;

    public Laptop() {
    }

    public Laptop(String name, String brand, String model, String os, String inventary,String computer_line,Boolean type_import) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.inventary=inventary;
        this.computer_line = computer_line;
        this.type_import=type_import;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getComputer_line() {
        return computer_line;
    }

    public void setComputer_line(String computer_line) {
        this.computer_line = computer_line;
    }

    public String getInventary() {
        return inventary;
    }

    public void setInventary(String inventary) {
        this.inventary = inventary;
    }

    public Boolean getType_import() {
        return type_import;
    }

    public void setType_import(Boolean type_import) {
        this.type_import = type_import;
    }

    @Override
    public String toString() {
        return "Laptop [id=" + id + ", name=" + name + ", brand=" + brand + ", model=" + model + ", os=" + os
                + ", computer_line=" + computer_line + ", inventary=" + inventary + ", type_import=" + type_import
                + "]";
    }

    

}
