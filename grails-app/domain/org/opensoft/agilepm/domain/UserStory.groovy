package org.opensoft.agilepm.domain

class UserStory {
	String name
	String description
	int state
	User owner
	
    static constraints = {
		description(nullable:true)
		owner(nulable:true)
    }
	static hasMany = [tasks:Task]
	static belongsTo = Iteration
}