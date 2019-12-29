package com.SaheerJeries.mehalev.controllers;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.SaheerJeries.mehalev.dao.RoleDAO;
import com.SaheerJeries.mehalev.models.Department;
import com.SaheerJeries.mehalev.models.Permission;
import com.SaheerJeries.mehalev.models.Role;
import com.SaheerJeries.mehalev.models.RolePermissions;

@RestController
@RequestMapping("/roles")
@CrossOrigin(origins = "*" , allowCredentials = "true")
public class RoleController{
	@Autowired
	private RoleDAO roleDAO;
	/**
    * @return all roles with permissions
    * @throws SQLException
    */
	@GetMapping("")
	public ResponseEntity<List<RolePermissions>> all() throws Exception{
		List<RolePermissions> roles = roleDAO.findAll();
		return ResponseEntity.ok().body(roles);
	}
	/**
	    * @return all permissions
	    * @throws SQLException
	    */
	@GetMapping("/permissions")
	public ResponseEntity<List<Permission>> allPermissions() throws Exception{
		List<Permission> roles = roleDAO.getAllPermissions();
		return ResponseEntity.ok().body(roles);
	}
	/**
    * @param role
    * @return new added role with permissions
    * @throws SQLException
    */
//Add Role
	@PostMapping("")
	public ResponseEntity<RolePermissions> newRole(@RequestBody RolePermissions role) throws Exception{
		RolePermissions newRole=roleDAO.add(role);
		
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newRole.getRole().getId()).toUri();
		
		return ResponseEntity.created(location).body(newRole);  
	}
}
