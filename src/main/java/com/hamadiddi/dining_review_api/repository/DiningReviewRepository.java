package com.hamadiddi.dining_review_api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hamadiddi.dining_review_api.model.DiningReview;
import com.hamadiddi.dining_review_api.model.Restaurant;

import java.util.List;


@Repository
public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

    // Fetch all reviews submitted by a specific user
    List<DiningReview> findBySubmittedBy(String submittedBy);

    // Fetch all reviews for a specific restaurant
    List<DiningReview> findByRestaurant(Restaurant restaurant);

    // // Fetch all reviews that are pending approval
    // List<DiningReview> findByApprovedIsNull();

    // // Fetch all approved reviews for a specific restaurant
    // List<DiningReview> findByRestaurantAndApprovedTrue(Restaurant restaurant);



}
