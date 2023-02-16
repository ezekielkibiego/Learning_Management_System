package com.kibiego.Learning_Management_System.model;

import javax.persistence.*;

@Entity
@Table
//(name = "institution", indexes = @Index(name = "fn_index",columnList = "name DESC"))
public class Institution {

    @Id
    @SequenceGenerator(
            name = "institution_sequence",
            sequenceName = "institution_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY,
    generator = "institution_sequence"
    )
    private Long id;
    private String name;
    private String location;

    public Institution() {
    }

    public Institution(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    //    public Institution(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Institution(String name) {
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Institution{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
