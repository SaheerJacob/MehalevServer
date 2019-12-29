package com.SaheerJeries.mehalev.dao.interfaces;


import com.SaheerJeries.mehalev.models.EmployeeData;
import com.SaheerJeries.mehalev.models.Login;

import java.sql.SQLException;

public interface ILoginDAO extends IDAO<Login>{


    EmployeeData validate(String username, String password) throws SQLException;
    EmployeeData getEmployeeData(String username) throws SQLException;
    Login getLogin(String username)throws SQLException;
    Integer failedAttemptsCounter(String username) throws SQLException;
    Login firstAttempte(String username) throws SQLException;
    boolean firstTime(String username)throws SQLException;
    Login resetAttempts(String username)throws SQLException;

    boolean logout(int employeeID) throws SQLException;
}
