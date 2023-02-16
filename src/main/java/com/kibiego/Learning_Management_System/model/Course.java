package com.kibiego.Learning_Management_System.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private Integer duration;
    private String description;


    public Institution getInstitution() {
        return institution;
    }
    public void setInstitution(Institution institution){
        this.institution = institution;
    }
    @OneToOne
    @JoinColumn(name = "institution_id",referencedColumnName = "ID")
    private Institution institution;

    public Set<Student> getStudent() {
        return student;
    }
    public void setStudent(Set<Student> course) {
        this.student = student;
    }

    @ManyToMany
    @JoinTable(
            name = "Course_Student",
            joinColumns = @JoinColumn(name = "Course_ID"),
            inverseJoinColumns = @JoinColumn(name = "Student_ID")
    )

    private Set<Student> student = new HashSet<>();
    public Course() {
    }

    public Course(Long id, String name, Integer duration, String description) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.description = description;
    }

    public Course(String name, Integer duration, String description) {
        this.name = name;
        this.duration = duration;
        this.description = description;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }
}
