package com.tprendergast

class Doctor {
	String fullName
	String qualifications
	String position
	String doctorEmail
	String password
	String doctorOffice
	int doctorPhone
	String bio

	String toString(){
	return fullName
}

    static constraints = {
	fullName blank: false
	qualifications blank: false
	position blank: false
	doctorEmail blank: false, email: true
	password blank: false
	doctorOffice blank: false
	doctorPhone blank: false
	bio blank: false, widget: 'textarea'
    }

static hasMany = [nurses:Nurse, appointments:Appointment, patients:Patient]
}
