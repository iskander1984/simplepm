package org.opensoft.agilepm.domain

class Project {
	static hasMany=[iterations:Iteration, releases:Release]
	String name
	String description
    static constraints = {
		description(nullable:true)
    } 
}
