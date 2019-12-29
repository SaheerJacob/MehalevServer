package com.SaheerJeries.mehalev.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.SaheerJeries.mehalev.models.Permission;
import com.SaheerJeries.mehalev.models.RolePermissions;

public interface IRoleDAO extends IDAO<RolePermissions> {
	public List<Permission> getAllPermissions() throws SQLException;
	
}
