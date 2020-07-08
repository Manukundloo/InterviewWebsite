package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class AWSQuestionnaireService {

	private static final String AWS_QUESTIONNAIRE_DASHBOARD = "/AWS/awsQuestionnaire";
	private static final String AWS_NOVICE_DASHBOARD = "/AWS/aws_novice";
	private static final String AWS_INTERMIDEATE_DASHBOARD = "/AWS/aws_intermediate";
	private static final String AWS_ADVANCE_DASHBOARD = "/AWS/aws_advance";

	public ModelAndView awsQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AWS_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView awsNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AWS_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView awsIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AWS_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView awsAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(AWS_ADVANCE_DASHBOARD);

		return model;

	}

}
