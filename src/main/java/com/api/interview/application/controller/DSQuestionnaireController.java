package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.DSQuestionnaireService;

@Controller
public class DSQuestionnaireController {

	@Autowired
	private DSQuestionnaireService lDSQuestionnaireService;

	@RequestMapping(value = "/dsQuestionnaire")
	public ModelAndView populateDSQuestionnairePage() {
		return lDSQuestionnaireService.dsQuestionnaire();

	}

	@RequestMapping(value = "/ds/fresher")
	public ModelAndView populateDSNovicePage() {
		return lDSQuestionnaireService.dsNoviceQuestionnaire();

	}

	@RequestMapping(value = "/ds/intermediate")
	public ModelAndView populateDSIntermediatePage() {
		return lDSQuestionnaireService.dsIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/ds/advance")
	public ModelAndView populateDSExpertPage() {
		return lDSQuestionnaireService.dsAdvanceQuestionnaire();

	}

}
