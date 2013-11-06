package fr.riverjach.agendamed.service;

import java.util.List;

import fr.riverjach.agendamed.exception.ServiceException;
import fr.riverjach.agendamed.model.Patient;

public interface PatientService {

	Patient save(Patient entite) throws ServiceException;

	void remove(Patient entite) throws ServiceException;

	Patient findById(Integer id) throws ServiceException;

	List<Patient> findAll() throws ServiceException;

	void removeById(Integer id) throws ServiceException;
}
