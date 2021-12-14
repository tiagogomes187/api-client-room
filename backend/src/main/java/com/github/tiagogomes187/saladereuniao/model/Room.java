package com.github.tiagogomes187.saladereuniao.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "meetingroom")
public @Data class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

}
