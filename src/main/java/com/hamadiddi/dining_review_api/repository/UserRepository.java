package com.hamadiddi.dining_review_api.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hamadiddi.dining_review_api.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // Fetch a user by their unique username
    Optional<User> findByUsername(String username);

    // Check if a user exists with a given username
    boolean existsByUsername(String username);




}
