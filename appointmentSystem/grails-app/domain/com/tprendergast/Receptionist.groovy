package com.tprendergast

class Receptionist {
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone

	String toString(){
	return recepName
}

    static constraints = {
	recepName blank: false
	recepEmail blank: false, email: true
	recepUsername blank: false
	recepPassword blank: false
	recepPhone blank: false
    }
}
