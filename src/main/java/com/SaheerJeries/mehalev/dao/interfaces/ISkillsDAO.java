package com.SaheerJeries.mehalev.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.SaheerJeries.mehalev.models.Skill;
import com.SaheerJeries.mehalev.models.SkillType;
import com.SaheerJeries.mehalev.models.vm.SkillProjectVM;
import com.SaheerJeries.mehalev.models.vm.SkillsVM;

public interface ISkillsDAO extends IDAO<Skill>{
	/**
	 * 
	 * @param id
	 * @return if skill exist return true, else return false
	 * @throws SQLException
	 */
	public boolean CheckIfSkillExist(int id) throws SQLException ;
	
	/**
	 * (used in findSkills method)
	 * @param type
	 * @return list of skills by types
	 * @throws SQLException
	 */
	public List<SkillProjectVM> findAllSkillsByType(SkillType type)throws SQLException;
	/**
	 * 
	 * @return pojo which has two skill lists by type
	 * @throws SQLException
	 */
	public SkillsVM findSkills() throws SQLException;
	
	
}
