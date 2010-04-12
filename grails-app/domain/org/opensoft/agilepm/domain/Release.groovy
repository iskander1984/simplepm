package org.opensoft.agilepm.domain

class Release {
	String name
	String description
	Date startDate
	Date endDate
    static constraints = {
		description(nullable:true)
		startDate(nullable:true)
		endDate(nullable:true)
    }
	static belongsTo = Project
}
