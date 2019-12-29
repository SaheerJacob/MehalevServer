package com.SaheerJeries.mehalev.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.SaheerJeries.mehalev.models.EmployeeException;

public interface IDAO<T> {
    List<T> findAll() throws SQLException, Exception;

    T find(int id) throws SQLException, Exception;

    T add(T item) throws SQLException, Exception;

    T update(T item) throws SQLException, Exception;

    T delete(int id) throws SQLException, Exception;
}
