package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.CQuestionnaireService;

@Controller
public class CQuestionnaireController {

	@Autowired
	private CQuestionnaireService lCQuestionnaireService;

	@RequestMapping(value = "/cQuestionnaire")
	public ModelAndView populateCQuestionnairePage() {
		return lCQuestionnaireService.cQuestionnaire();

	}

	@RequestMapping(value = "/c/fresher")
	public ModelAndView populateCNovicePage() {
		return lCQuestionnaireService.cNoviceQuestionnaire();

	}

	@RequestMapping(value = "/c/intermediate")
	public ModelAndView populateCIntermediatePage() {
		return lCQuestionnaireService.cIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/c/advance")
	public ModelAndView populateCExpertPage() {
		return lCQuestionnaireService.cAdvanceQuestionnaire();

	}

}
