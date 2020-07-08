package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class PHPQuestionnaireService {

	private static final String PHP_QUESTIONNAIRE_DASHBOARD = "/PHP/phpQuestionnaire";
	private static final String PHP_NOVICE_DASHBOARD = "/PHP/php_novice";
	private static final String PHP_INTERMIDEATE_DASHBOARD = "/PHP/php_intermediate";
	private static final String PHP_ADVANCE_DASHBOARD = "/PHP/php_advance";

	public ModelAndView phpQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PHP_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView phpNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PHP_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView phpIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PHP_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView phpAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(PHP_ADVANCE_DASHBOARD);

		return model;

	}

}
