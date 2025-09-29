package com.hamadiddi.dining_review_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * You have no need to apply any Spring Data JPA annotations here 
 * because this will not be persisted to the database. 
 * This model is needed only as part of the API contract.
 */

@Data
@AllArgsConstructor
public class AdminReviewAction {

    private Boolean  isAccepted;

}
