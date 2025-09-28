package com.StoxManager.StoxsSense.model;

import com.StoxManager.StoxsSense.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Embedded
    private TwoFactorAuth twoFactorAuth= new TwoFactorAuth();
    private USER_ROLE role= USER_ROLE.ROLE_CUSTOMER;

}
