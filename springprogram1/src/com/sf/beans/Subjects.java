package com.sf.beans;

import java.util.List;

public class Subjects {
	private List<String> subjectList;

	public List<String> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return subjectList.toString();
	}
	
}
