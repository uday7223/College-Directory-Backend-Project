package org.jsp.cds.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "faculty_members")
public class Faculty {



    @Id
    @Column(name = "user_id")
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    @Column
    private String photo;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column
    private String officeHours;

    // Getters and setters
}
