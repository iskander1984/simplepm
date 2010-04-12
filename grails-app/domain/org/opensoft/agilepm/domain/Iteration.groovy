package org.opensoft.agilepm.domain

class Iteration {
	String name
	String description
	Date startDate
	Date endDate
	int state
	static constraints = {
		description(nullable:true)
		startDate(nullable:true)
		endDate(nullable:true)
		state(nulable:true)
	}
	static hasMany=[userStories:UserStory]
	static belongsTo = Project
}