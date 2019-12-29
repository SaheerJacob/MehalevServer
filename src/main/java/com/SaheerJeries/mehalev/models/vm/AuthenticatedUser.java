package com.SaheerJeries.mehalev.models.vm;

import com.SaheerJeries.mehalev.models.Permission;
import com.SaheerJeries.mehalev.models.Role;
import com.SaheerJeries.mehalev.models.RolePermissions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.stereotype.Service;


import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class AuthenticatedUser {

    private int id;
    private int employeeNumber;
    private String email;
    private List<RolePermissions> rolePermissions;
    
}
