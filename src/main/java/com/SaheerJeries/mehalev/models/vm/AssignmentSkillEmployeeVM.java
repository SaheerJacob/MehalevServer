package com.SaheerJeries.mehalev.models.vm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AssignmentSkillEmployeeVM {
    private Integer id;
    private Integer managerID;
    private String name;
    private List<SkillsLevelVM> technicalSkills;
    private List <SkillsLevelVM> productSkills;
}
