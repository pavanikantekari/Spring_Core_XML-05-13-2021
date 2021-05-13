package com.ojas.SpringCoreProject.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int eid;
	private String ename;
	private List<String> skillSet;
	private Map<String, String> projects;
	private Set<String> phoneNos;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	public Set<String> getPhoneNos() {
		return phoneNos;
	}
	public void setPhoneNos(Set<String> phoneNos) {
		this.phoneNos = phoneNos;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", skillSet=" + skillSet + ", projects=" + projects
				+ ", phoneNos=" + phoneNos + "]";
	}

}
