package fr.riverjach.agendamed.dao.impl;

import org.springframework.stereotype.Repository;

import fr.riverjach.agendamed.dao.PatientDAO;
import fr.riverjach.agendamed.model.Patient;

@Repository
public class PatientDAOJPA extends GenericDAOJPA<Patient, Integer> implements
		PatientDAO {

	public PatientDAOJPA() {
		super(Patient.class);
	}

}
