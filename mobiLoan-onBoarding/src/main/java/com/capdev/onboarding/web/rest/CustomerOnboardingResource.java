package com.capdev.onboarding.web.rest;

import com.capdev.onboarding.domain.CustomerOnboarding;
import com.capdev.onboarding.domain.CustomerOnboardingResponse;
import com.capdev.onboarding.service.CustomerOnboardingService;
import com.capdev.onboarding.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * REST controller for managing {@link com.capdev.onboarding.domain.CustomerOnboarding}.
 */
@RestController
@RequestMapping("/api")
public class CustomerOnboardingResource {

    private final Logger log = LoggerFactory.getLogger(CustomerOnboardingResource.class);

    private static final String ENTITY_NAME = "onBoardingCustomerOnboarding";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final CustomerOnboardingService customerOnboardingService;

    public CustomerOnboardingResource(CustomerOnboardingService customerOnboardingService) {
        this.customerOnboardingService = customerOnboardingService;
    }

    /**
     * {@code POST  /customer-onboardings} : Create a new customerOnboarding.
     *
     * @param customerOnboarding the customerOnboarding to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new customerOnboarding, or with status {@code 400 (Bad Request)} if the customerOnboarding has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/customer-onboardings")
    public Object createCustomerOnboarding(@Valid @RequestBody CustomerOnboarding customerOnboarding)  {
        log.debug("REST request to save CustomerOnboarding : {}", customerOnboarding);
        if (customerOnboarding.getId() != null) {
            throw new BadRequestAlertException("A new customerOnboarding cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Map<String,Object> result = (Map<String, Object>) customerOnboardingService.save(customerOnboarding);
        CustomerOnboardingResponse response = new CustomerOnboardingResponse();
        
        response.setReceiptNo(result.get("accountIdentifier").toString());
        response.setRequestRefID("");
        response.setStatusCode("S0");
        response.setStatus("Processing");
        response.setStatusDesc("Success");
        return response;
    }

//    /**
//     * {@code PUT  /customer-onboardings} : Updates an existing customerOnboarding.
//     *
//     * @param customerOnboarding the customerOnboarding to update.
//     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated customerOnboarding,
//     * or with status {@code 400 (Bad Request)} if the customerOnboarding is not valid,
//     * or with status {@code 500 (Internal Server Error)} if the customerOnboarding couldn't be updated.
//     * @throws URISyntaxException if the Location URI syntax is incorrect.
//     */
//    @PutMapping("/customer-onboardings")
//    public ResponseEntity<CustomerOnboarding> updateCustomerOnboarding(@Valid @RequestBody CustomerOnboarding customerOnboarding) throws URISyntaxException {
//        log.debug("REST request to update CustomerOnboarding : {}", customerOnboarding);
//        if (customerOnboarding.getId() == null) {
//            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
//        }
//        CustomerOnboarding result = customerOnboardingService.save(customerOnboarding);
//        return ResponseEntity.ok()
//            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, customerOnboarding.getId().toString()))
//            .body(result);
//    }
//
//    /**
//     * {@code GET  /customer-onboardings} : get all the customerOnboardings.
//     *
//
//     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of customerOnboardings in body.
//     */
//    @GetMapping("/customer-onboardings")
//    public List<CustomerOnboarding> getAllCustomerOnboardings() {
//        log.debug("REST request to get all CustomerOnboardings");
//        return customerOnboardingService.findAll();
//    }
//
//    /**
//     * {@code GET  /customer-onboardings/:id} : get the "id" customerOnboarding.
//     *
//     * @param id the id of the customerOnboarding to retrieve.
//     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the customerOnboarding, or with status {@code 404 (Not Found)}.
//     */
//    @GetMapping("/customer-onboardings/{id}")
//    public ResponseEntity<CustomerOnboarding> getCustomerOnboarding(@PathVariable Long id) {
//        log.debug("REST request to get CustomerOnboarding : {}", id);
//        Optional<CustomerOnboarding> customerOnboarding = customerOnboardingService.findOne(id);
//        return ResponseUtil.wrapOrNotFound(customerOnboarding);
//    }
//
//    /**
//     * {@code DELETE  /customer-onboardings/:id} : delete the "id" customerOnboarding.
//     *
//     * @param id the id of the customerOnboarding to delete.
//     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
//     */
//    @DeleteMapping("/customer-onboardings/{id}")
//    public ResponseEntity<Void> deleteCustomerOnboarding(@PathVariable Long id) {
//        log.debug("REST request to delete CustomerOnboarding : {}", id);
//        customerOnboardingService.delete(id);
//        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
//    }
}
