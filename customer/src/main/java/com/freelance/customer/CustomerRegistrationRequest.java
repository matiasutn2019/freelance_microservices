package com.freelance.customer;

public record CustomerRegistrationRequest(
    String firstname,
    String lastname,
    String email) {

}
