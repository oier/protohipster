package com.flipper83.protohipster.feed.datasource.api.model;

/**
 * this is a user on the Api Model.
 */
public class UserApi {

    private UserApiName name;
    private String email;
    private String picture;

    public UserApiName getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPicture() {
        return picture;
    }
}
