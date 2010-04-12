package org.opensoft.agilepm.domain

class User{
	String login
	String firstName
	String secondName
	String password
	String email
	
	static hasMany = [ roles: Role ]
	static constraints = {
		login(unique:true, length:5..15)
		firstName(nullable:true)
		secondName(nullable:true)
		password(matches:/[\w\d]+/, length:6..12)
		email(email:true)
	}
	
	static belongsTo = Team
	
	
}
