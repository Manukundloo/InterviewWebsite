package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.HTMLQuestionnaireService;

@Controller
public class HTMLQuestionnaireController {

	@Autowired
	private HTMLQuestionnaireService lHTMLQuestionnaireService;

	@RequestMapping(value = "/htmlQuestionnaire")
	public ModelAndView populateHTMLQuestionnairePage() {
		return lHTMLQuestionnaireService.htmlQuestionnaire();

	}

	@RequestMapping(value = "/html/fresher")
	public ModelAndView populateHTMLNovicePage() {
		return lHTMLQuestionnaireService.htmlNoviceQuestionnaire();

	}

	@RequestMapping(value = "/html/intermediate")
	public ModelAndView populateHTMLIntermediatePage() {
		return lHTMLQuestionnaireService.htmlIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/html/advance")
	public ModelAndView populateHTMLExpertPage() {
		return lHTMLQuestionnaireService.htmlAdvanceQuestionnaire();

	}

}
