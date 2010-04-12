package org.opensoft.agilepm.domain

class Task {

	String name
	String description
	User owner	
	int state
	long priority
	UserStory userStory
	static constraints = {
		owner(nullable:true)
		state(nullable:true)
		priority(nullable:true)
		userStory(nullable:true)
    }
	static belongsTo = UserStory
	
}

