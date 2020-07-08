package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.JSQuestionnaireService;

@Controller
public class JSQuestionnaireController {

	@Autowired
	private JSQuestionnaireService lJSQuestionnaireService;

	@RequestMapping(value = "/jsQuestionnaire")
	public ModelAndView populateJSQuestionnairePage() {
		return lJSQuestionnaireService.jsQuestionnaire();

	}

	@RequestMapping(value = "/js/fresher")
	public ModelAndView populateJSNovicePage() {
		return lJSQuestionnaireService.jsNoviceQuestionnaire();

	}

	@RequestMapping(value = "/js/intermediate")
	public ModelAndView populateJSIntermediatePage() {
		return lJSQuestionnaireService.jsIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/js/advance")
	public ModelAndView populateJSExpertPage() {
		return lJSQuestionnaireService.jsAdvanceQuestionnaire();

	}

}
