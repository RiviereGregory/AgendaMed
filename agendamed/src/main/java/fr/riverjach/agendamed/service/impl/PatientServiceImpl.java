package fr.riverjach.agendamed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.riverjach.agendamed.dao.PatientDAO;
import fr.riverjach.agendamed.exception.DAOException;
import fr.riverjach.agendamed.exception.ServiceException;
import fr.riverjach.agendamed.model.Patient;
import fr.riverjach.agendamed.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;

	@Override
	@Transactional
	public Patient save(Patient entite) throws ServiceException {
		try {
			entite = patientDAO.save(entite);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
		return entite;
	}

	@Override
	@Transactional
	public void remove(Patient entite) throws ServiceException {
		try {

			patientDAO.remove(entite);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public Patient findById(Integer id) throws ServiceException {
		try {
			return patientDAO.findById(id);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public List<Patient> findAll() throws ServiceException {
		List<Patient> list;
		try {
			list = patientDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
		return list;
	}

	@Override
	@Transactional
	public void removeById(Integer id) throws ServiceException {
		try {

			patientDAO.removeById(id);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

}
