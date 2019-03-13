package com.myapp.spring.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="project")
public class Project {
	
	@Id
	private int id;
	private String name;
	private String projectstartdt;
	private String projectcompletiondt;
	private String segment;
	private String category;
	private String categoryfamily;
	private String categoryspend;
	private String projectsaving;
	private String categorymanager;
	private String blackbelt;
	private String spendtype;
	private String projectstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectstartdt() {
		return projectstartdt;
	}
	public void setProjectstartdt(String projectstartdt) {
		this.projectstartdt = projectstartdt;
	}
	public String getProjectcompletiondt() {
		return projectcompletiondt;
	}
	public void setProjectcompletiondt(String projectcompletiondt) {
		this.projectcompletiondt = projectcompletiondt;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryfamily() {
		return categoryfamily;
	}
	public void setCategoryfamily(String categoryfamily) {
		this.categoryfamily = categoryfamily;
	}
	public String getCategoryspend() {
		return categoryspend;
	}
	public void setCategoryspend(String categoryspend) {
		this.categoryspend = categoryspend;
	}
	public String getProjectsaving() {
		return projectsaving;
	}
	public void setProjectsaving(String projectsaving) {
		this.projectsaving = projectsaving;
	}
	public String getCategorymanager() {
		return categorymanager;
	}
	public void setCategorymanager(String categorymanager) {
		this.categorymanager = categorymanager;
	}
	public String getBlackbelt() {
		return blackbelt;
	}
	public void setBlackbelt(String blackbelt) {
		this.blackbelt = blackbelt;
	}
	public String getSpendtype() {
		return spendtype;
	}
	public void setSpendtype(String spendtype) {
		this.spendtype = spendtype;
	}
	public String getProjectstatus() {
		return projectstatus;
	}
	public void setProjectstatus(String projectstatus) {
		this.projectstatus = projectstatus;
	}
	
	
}