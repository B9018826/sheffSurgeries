package com.tprendergast

class BootStrap {

    def init = { servletContext ->
	def DrSam=new Doctor(
	fullName: 'Surgeon Sam',
	qualifications: 'Degree',
	position: 'Head',
	doctorEmail: 'b9018826@my.shu.ac.uk',
	password: 'Dr.Acula',
	doctorOffice: 'SS-99',
	doctorPhone: '0170945324',
	bio: '"hi there"').save()

	def DrDave=new Doctor(
	fullName: 'Big Dave',
	qualifications: 'Degree',
	position: 'senior',
	doctorEmail: 'b9018826@my.shu.ac.uk',
	password: 'testtest',
	doctorOffice: 'SS-994',
	doctorPhone: '0170945324',
	bio: '"hello"').save()

	def NurHelen=new Nurse(
	nurseName: 'Helen Healy',
	qualifications: 'nurse degree',
	nurseEmail: 'b9018826@my.shu.ac.uk',
	nurseOffice: 'b27',
	nursePhone: '01709378237',
	doctor: DrSam).save()

	def NurGlenn=new Nurse(
	nurseName: 'Glenn Nooman',
	qualifications: 'nurse degree',
	nurseEmail: 'b9018826@my.shu.ac.uk',
	nurseOffice: 'b28',
	nursePhone: '01709375537',
	doctor: DrDave).save()

	def IGeezer=new Patient(
	patientName: 'Ian Geezer',
	patientAddress: '2 big street',
	patientResidence: 'Sheffield',
	patientDob: new Date('04/05/1999'),
	patientID: 'T2424',
	dateRegistered: new Date('04/05/2020'),
	patientPhone: '0170932323',
	doctor: DrSam).save()

	def LLauren=new Patient(
	patientName: 'Luna Lauren',
	patientAddress: '4 big street',
	patientResidence: 'Sheffield',
	patientDob: new Date('08/02/1995'),
	patientID: 'T2424',
	dateRegistered: new Date('08/02/2021'),
	patientPhone: '01709323766',
	doctor: DrDave).save()

	def AppOne=new Appointment(
	appDate: new Date('07/07/2021'),
	appTime: '3:00pm',
	appDuration: '45',
	roomNumber: 'T1000',
	patient: IGeezer,
	doctor: DrSam).save()

	def AppTwo=new Appointment(
	appDate: new Date('09/09/2021'),
	appTime: '1:40pm',
	appDuration: '30',
	roomNumber: 'T2000',
	patient: LLauren,
	doctor: DrDave).save()

	def PrescripOne=new Prescription(
	pharmacyName: 'Main Pharmacy',
	prescripNumber: '42434',
	medicine: 'Diazapene',
	totalCost: '5.90',
	dateIssued: new Date('04/04/2021'),
	patientPaying: true,
	patient: IGeezer,
	doctor: DrSam).save()

	def PrescripTwo=new Prescription(
	pharmacyName: 'Secondary Pharmacy',
	prescripNumber: '75474',
	medicine: 'Cloroxopene',
	totalCost: '3.60',
	dateIssued: new Date('07/07/2021'),
	patientPaying: false,
	patient: LLauren,
	doctor: DrDave).save()

	def RecepOne=new Receptionist(
	recepName: 'Liu Kang',
	recepEmail: 'b9018826@my.shu.ac.uk',
	recepUsername: 'FireBall123',
	recepPassword: 'password123',
	recepPhone: '0170943984').save()

	def RecepTwo=new Receptionist(
	recepName: 'Hal Emmerich',
	recepEmail: 'b9018826@my.shu.ac.uk',
	recepUsername: 'Otacon123',
	recepPassword: 'password321',
	recepPhone: '0170940858').save()

	def SurgeryOne=new Surgery(
	name: 'Chainsaw surgery',
	address: '23 chopping block',
	postcode: 'T43 H23',
	telephone: '0170932838',
	numberOfPatients: '37',
	description: 'It hurts',
	openingTime: '09:00-19:00',
	patient: IGeezer,
	nurse: NurHelen,
	appointment: AppOne,
	receptionist: RecepOne,
	doctor: DrSam).save()

	def SurgeryTwo=new Surgery(
	name: 'Intoxicated surgery',
	address: '12 bonk lane',
	postcode: 'RE23 L54',
	telephone: '017093243',
	numberOfPatients: '59',
	description: 'Good place',
	openingTime: '12:00-23:00',
	patient: LLauren,
	nurse: NurGlenn,
	appointment: AppTwo,
	receptionist: RecepTwo,
	doctor: DrDave).save()
    }
    def destroy = {
    }
}
