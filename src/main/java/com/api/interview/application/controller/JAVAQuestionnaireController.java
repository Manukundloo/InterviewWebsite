package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.JAVAQuestionnaireService;

@Controller
public class JAVAQuestionnaireController {

	@Autowired
	private JAVAQuestionnaireService lJAVAQuestionnaireService;

	@RequestMapping(value = "/javaQuestionnaire")
	public ModelAndView populateJAVAQuestionnairePage() {
		return lJAVAQuestionnaireService.javaQuestionnaire();

	}

	@RequestMapping(value = "/java/fresher")
	public ModelAndView populateJAVANovicePage() {
		return lJAVAQuestionnaireService.javaNoviceQuestionnaire();

	}

	@RequestMapping(value = "/java/intermediate")
	public ModelAndView populateJAVAIntermediatePage() {
		return lJAVAQuestionnaireService.javaIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/java/advance")
	public ModelAndView populateJAVAExpertPage() {
		return lJAVAQuestionnaireService.javaAdvanceQuestionnaire();

	}

}
