package com.tprendergast

class Nurse {
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	int nursePhone

	String toString(){
	return nurseName
}

    static constraints = {
	nurseName blank: false
	qualifications blank: false
	nurseEmail blank: false, email: true
	nurseOffice blank: false
	nursePhone blank: false
    }

static belongsTo = [doctor:Doctor]
}
