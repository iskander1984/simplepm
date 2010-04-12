package org.opensoft.agilepm.domain

class Team {
	String name

    static constraints = {
    }
	
	static hasMany = [users:User]
}
