package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.PythonQuestionnaireService;

@Controller
public class PythonQuestionnaireController {

	@Autowired
	private PythonQuestionnaireService lPythonQuestionnaireService;

	@RequestMapping(value = "/pythonQuestionnaire")
	public ModelAndView populatePythonQuestionnairePage() {
		return lPythonQuestionnaireService.pythonQuestionnaire();

	}

	@RequestMapping(value = "/python/fresher")
	public ModelAndView populatePythonNovicePage() {
		return lPythonQuestionnaireService.pythonNoviceQuestionnaire();

	}

	@RequestMapping(value = "/python/intermediate")
	public ModelAndView populatePythonIntermediatePage() {
		return lPythonQuestionnaireService.pythonIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/python/advance")
	public ModelAndView populatePythonExpertPage() {
		return lPythonQuestionnaireService.pythonAdvanceQuestionnaire();

	}

}
