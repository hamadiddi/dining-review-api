package com.hamadiddi.dining_review_api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hamadiddi.dining_review_api.model.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long>{

    // Fetch restaurants by zip code + allergy score
    List<Restaurant> findByZipCodeAndPeanutScoreIsNotNullOrderByPeanutScoreDesc(String zipCode);

    List<Restaurant> findByZipCodeAndEggScoreIsNotNullOrderByEggScoreDesc(String zipCode);

    List<Restaurant> findByZipCodeAndDairyScoreIsNotNullOrderByDairyScoreDesc(String zipCode);


}
