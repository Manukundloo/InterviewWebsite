package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class JSQuestionnaireService {

	private static final String JS_QUESTIONNAIRE_DASHBOARD = "/JS/jsQuestionnaire";
	private static final String JS_NOVICE_DASHBOARD = "/JS/js_novice";
	private static final String JS_INTERMIDEATE_DASHBOARD = "/JS/js_intermediate";
	private static final String JS_ADVANCE_DASHBOARD = "/JS/js_advance";

	public ModelAndView jsQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JS_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView jsNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JS_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView jsIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JS_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView jsAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JS_ADVANCE_DASHBOARD);

		return model;

	}

}
