package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CSSQuestionnaireService {

	private static final String CSS_QUESTIONNAIRE_DASHBOARD = "/CSS/cssQuestionnaire";
	private static final String CSS_NOVICE_DASHBOARD = "/CSS/css_novice";
	private static final String CSS_INTERMIDEATE_DASHBOARD = "/CSS/css_intermediate";
	private static final String CSS_ADVANCE_DASHBOARD = "/CSS/css_advance";

	public ModelAndView cssQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CSS_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView cssNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CSS_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView cssIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CSS_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView cssAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CSS_ADVANCE_DASHBOARD);

		return model;

	}

}
