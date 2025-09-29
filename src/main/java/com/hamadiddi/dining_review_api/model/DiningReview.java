package com.hamadiddi.dining_review_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "DINING_REVIEW")
public class DiningReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String submittedBy;

    // Foreign key reference to Restaurant
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id", nullable = false, referencedColumnName = "restaurant_id")
    private Restaurant restaurant;

    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;

    // Optional user commentary
    @Column(length = 1000)
    private String commentary;







}
