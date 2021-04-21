package com.tprendergast

class Prescription {
	String pharmacyName
	int prescripNumber
	String medicine
	float totalCost
	Date dateIssued
	Boolean patientPaying

	String toString(){
	return pharmacyName
}

    static constraints = {
	pharmacyName blank: false
	prescripNumber blank: false
	medicine blank: false
	totalCost blank: false
	dateIssued blank: false
	patientPaying blank: false
    }
static belongsTo = [doctor:Doctor, patient:Patient]
}
