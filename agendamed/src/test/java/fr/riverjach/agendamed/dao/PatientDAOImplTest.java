package fr.riverjach.agendamed.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.riverjach.agendamed.exception.DAOException;
import fr.riverjach.agendamed.model.Patient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/dispatcher-servlet.xml" })
public class PatientDAOImplTest {
	@Autowired
	private PatientDAO patientDAO;

	@Ignore
	@Test
	@Transactional
	public void testSave() {
		try {
			Patient patient = new Patient();
			patient.setAdresse("41 larles");
			patient.setNom("Nom1");
			patient.setPrenom("Prenom");
			Date dateNaissance;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

			dateNaissance = dateFormat.parse("22/11/2012");
			patient.setDateNaissance(dateNaissance);
			patient.setNumeroTelephone("0614131518");

			patientDAO.save(patient);

		} catch (ParseException | DAOException e) {
			Assert.fail(e.getMessage());
		}

	}

	@Ignore
	@Test
	@Transactional
	public void testFindAll() {
		try {
			Patient patient = new Patient();
			patient.setAdresse("41 larles");
			patient.setNom("Nom1");
			patient.setPrenom("Prenom");
			Date dateNaissance;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
			dateNaissance = dateFormat.parse("22/11/2012");
			patient.setDateNaissance(dateNaissance);
			patient.setNumeroTelephone("0614131518");
			patientDAO.save(patient);

			patient = new Patient();
			patient.setNom("Nom2");
			patient.setPrenom("Prenom2");
			patientDAO.save(patient);

			patient = new Patient();
			patient.setNom("Nom3");
			patient.setPrenom("Prenom3");
			patientDAO.save(patient);

			List<Patient> list = patientDAO.findAll();
			for (Patient patient2 : list) {
				System.out.println(patient2);
				System.out.println("");
			}

		} catch (ParseException | DAOException e) {
			Assert.fail(e.getMessage());
		}

	}

	@Test
	@Transactional
	public void testFindById() {
		try {
			Patient patient = new Patient();
			patient.setAdresse("41 larles");
			patient.setNom("Nom1");
			patient.setPrenom("Prenom");
			Date dateNaissance;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
			dateNaissance = dateFormat.parse("22/11/2012");
			patient.setDateNaissance(dateNaissance);
			patient.setNumeroTelephone("0614131518");
			patientDAO.save(patient);

			patient = new Patient();
			patient.setNom("Nom2");
			patient.setPrenom("Prenom2");
			patientDAO.save(patient);

			patient = new Patient();
			patient.setNom("Nom Nouveau");
			patient.setPrenom("Prenom3");
			patient = patientDAO.save(patient);

			System.out.println(patient);
			patientDAO.findAll();

			Patient patient2 = patientDAO.findById(1);

			System.out.println(patient2);
			System.out.println("");

		} catch (ParseException | DAOException e) {
			Assert.fail(e.getMessage());
		}

	}
}
