package com.example.tp_web_fullstack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Candidates {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String email;
    public String phoneNumber;
    public String address;
    public String review;
    public Integer rating;
    public Date jobMeetingDate;

}
