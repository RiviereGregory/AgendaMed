package fr.riverjach.agendamed.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.riverjach.agendamed.exception.ServiceException;
import fr.riverjach.agendamed.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView findAllVoitures() {
		Map<String, Object> params = new HashMap<String, Object>();

		try {
			params.put("patients", patientService.findAll());
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		// La map nous permet de passer plusieurs paramètre
		return new ModelAndView("index", params);

	}

	@RequestMapping(value = "/index.do", method = RequestMethod.POST)
	public ModelAndView findAllVoitures2() {
		Map<String, Object> params = new HashMap<String, Object>();

		try {
			params.put("patients", patientService.findAll());
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		// La map nous permet de passer plusieurs paramètre
		return new ModelAndView("index", params);

	}

}
