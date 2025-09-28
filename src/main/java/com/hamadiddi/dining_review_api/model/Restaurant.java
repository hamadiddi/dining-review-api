package com.hamadiddi.dining_review_api.model;


import java.time.LocalDateTime;
import java.time.LocalTime;

import com.hamadiddi.dining_review_api.enums.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
// @NoArgsConstructor
@AllArgsConstructor
@Table(name = "RESTAURANT")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String region;
    private String district;
    private String country;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;
    private String website;
    private Boolean isOpen;

    @Column(name = "opening_time")
    private LocalTime openingTime;

    @Column(name = "closing_time")
    private LocalTime closingTime;

    private Double peanutScore;
    private Double eggScore;
    private Double diaryScore;    

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
