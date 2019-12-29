package com.SaheerJeries.mehalev.dao;


import com.SaheerJeries.mehalev.models.vm.AuthenticatedUser;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class AuthenticationDAO {

    private AuthenticatedUser authenticatedUser;


    public void setAuthenticatedUser(AuthenticatedUser authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    public AuthenticatedUser getAuthenticatedUser() {
        return authenticatedUser;
    }
}
