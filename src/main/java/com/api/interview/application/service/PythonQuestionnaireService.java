package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class PythonQuestionnaireService {

	private static final String PYTHON_QUESTIONNAIRE_DASHBOARD = "/PYTHON/pythonQuestionnaire";
	private static final String PYTHON_NOVICE_DASHBOARD = "/PYTHON/python_novice";
	private static final String PYTHON_INTERMIDEATE_DASHBOARD = "/PYTHON/python_intermediate";
	private static final String PYTHON_ADVANCE_DASHBOARD = "/PYTHON/python_advance";

	public ModelAndView pythonQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PYTHON_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView pythonNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PYTHON_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView pythonIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PYTHON_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView pythonAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PYTHON_ADVANCE_DASHBOARD);

		return model;

	}

}
