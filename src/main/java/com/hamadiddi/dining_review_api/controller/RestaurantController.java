package com.hamadiddi.dining_review_api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamadiddi.dining_review_api.model.Restaurant;
import com.hamadiddi.dining_review_api.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantRepository repository;

    @PostMapping
    public ResponseEntity<?> addRestaurant(@RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(repository.save(restaurant));
    }

   @GetMapping("/{restaurantId}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long restaurantId) {
        return repository.findById(restaurantId)
                .map(ResponseEntity::ok)          // if found, return 200 OK + restaurant
                .orElse(ResponseEntity.notFound().build()); // if not found, return 404
    }

    //  We will start from this method
    @GetMapping("/search")
    public List<Restaurant> searchRestaurant(@RequestParam(required = false) String zipcode, @RequestParam(required = false) String allergy) {
            List<Restaurant> list = zipcode != null ? repository.findByZipCode(zipcode) : repository.findAll();

        if (allergy != null) {
            return list.stream()
                    .filter(r -> {
                        switch (allergy.toLowerCase()) {
                            case "peanut": return r.getPeanutScore() != null;
                            case "egg": return r.getEggScore() != null;
                            case "dairy": return r.getDairyScore() != null;
                            default: return false;
                        }
                    }).toList();
        }

        return list;
    }
}
    
    






