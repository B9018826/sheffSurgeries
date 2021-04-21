package com.tprendergast

class Surgery {
	String name
	String address
	String postcode
	int telephone
	int numberOfPatients
	String description
	String openingTime

	String toString(){
	return name
}

    static constraints = {
	name blank: false
	address blank: false
	postcode blank: false
	telephone blank: false
	numberOfPatients blank: false
	description blank: false
	openingTime blank: false
    }
static belongsTo = [patient:Patient, appointment:Appointment, doctor:Doctor, nurse:Nurse, receptionist:Receptionist]
}
