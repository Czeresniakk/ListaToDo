package com.example.demo.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "LISTTODO")
public class Task
{
    @Column(name = "TITLE")
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Task(){}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return this.id;
    }

}
