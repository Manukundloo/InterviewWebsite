package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.LinuxQuestionnaireService;

@Controller
public class LinuxQuestionnaireController {

	@Autowired
	private LinuxQuestionnaireService lLinuxQuestionnaireService;

	@RequestMapping(value = "/linuxQuestionnaire")
	public ModelAndView populateLinuxQuestionnairePage() {
		return lLinuxQuestionnaireService.linuxQuestionnaire();

	}

	@RequestMapping(value = "/linux/fresher")
	public ModelAndView populateLinuxNovicePage() {
		return lLinuxQuestionnaireService.linuxNoviceQuestionnaire();

	}

	@RequestMapping(value = "/linux/intermediate")
	public ModelAndView populateLinuxIntermediatePage() {
		return lLinuxQuestionnaireService.linuxIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/linux/advance")
	public ModelAndView populateLinuxExpertPage() {
		return lLinuxQuestionnaireService.linuxAdvanceQuestionnaire();

	}

}
