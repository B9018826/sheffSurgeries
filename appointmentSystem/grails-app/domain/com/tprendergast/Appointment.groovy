package com.tprendergast

class Appointment {
	Date appDate
	String appTime
	int appDuration
	String roomNumber

	String toString(){
	return appDate
}

    static constraints = {
	appDate blank: false
	appTime blank: false
	appDuration blank: false
	roomNumber blank: false
    }

static belongsTo = [doctor:Doctor, patient:Patient]
}
