package com.kibiego.Learning_Management_System.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;

    public Institution getInstitution() {
        return institution;
    }
    public void setInstitution(Institution institution){
        this.institution = institution;
    }
    @OneToOne
    @JoinColumn(name = "institution_id",referencedColumnName = "ID")
    private Institution institution;

    public Set<Course> getCourse() {
        return course;
    }
    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    @ManyToMany
    @JoinTable(
            name = "Student_Course",
            joinColumns = @JoinColumn(name = "Student_ID"),
            inverseJoinColumns = @JoinColumn(name = "Course_ID")
    )

    private Set<Course> course = new HashSet<>();

    public Student() {
    }

    public Student(Long id, String first_name, String last_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Student(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
