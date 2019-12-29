package com.SaheerJeries.mehalev.dao.interfaces;

import com.SaheerJeries.mehalev.models.vm.EmployeeAssignmentVM;

import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

public interface IEmployeeAssignmentDAO extends IDAO<EmployeeAssignmentVM> {
    public List<EmployeeAssignmentVM> getDoneAssignments(Integer managerID, Date requestedDate, Integer pageNumber, Integer limit)throws SQLException;
}
