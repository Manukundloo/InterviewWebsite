package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class AIQuestionnaireService {

	private static final String AI_QUESTIONNAIRE_DASHBOARD = "/AI/aiQuestionnaire";
	private static final String AI_NOVICE_DASHBOARD = "/AI/ai_novice";
	private static final String AI_INTERMIDEATE_DASHBOARD = "/AI/ai_intermediate";
	private static final String AI_ADVANCE_DASHBOARD = "/AI/ai_advance";

	public ModelAndView aiQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AI_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView aiNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AI_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView aiIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AI_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView aiAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AI_ADVANCE_DASHBOARD);

		return model;

	}

}
