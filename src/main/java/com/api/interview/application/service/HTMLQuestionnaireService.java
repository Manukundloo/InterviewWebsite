package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class HTMLQuestionnaireService {

	private static final String HTML_QUESTIONNAIRE_DASHBOARD = "/HTML/htmlQuestionnaire";
	private static final String HTML_NOVICE_DASHBOARD = "/HTML/html_novice";
	private static final String HTML_INTERMIDEATE_DASHBOARD = "/HTML/html_intermediate";
	private static final String HTML_ADVANCE_DASHBOARD = "/HTML/html_advance";

	public ModelAndView htmlQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(HTML_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView htmlNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(HTML_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView htmlIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(HTML_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView htmlAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(HTML_ADVANCE_DASHBOARD);

		return model;

	}

}
