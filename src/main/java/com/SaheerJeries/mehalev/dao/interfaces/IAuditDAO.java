package com.SaheerJeries.mehalev.dao.interfaces;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.SaheerJeries.mehalev.models.Audit;
import com.SaheerJeries.mehalev.models.AuditEmployee;

public interface IAuditDAO extends IDAO<AuditEmployee>{
	List<AuditEmployee> searchAudit(int number,String activity,Optional<Date> datefrom, Optional<Date> dateto,int page,int limit) throws SQLException;
	List<AuditEmployee> findAll(int page,int limit) throws SQLException;
	Integer countAudit() throws SQLException;
	
}
