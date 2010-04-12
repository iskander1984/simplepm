package org.opensoft.agilepm.domain

class Role {
    
	String name
    String description
    static constraints = {
		description(nullable:true)
	}
	
   }	
