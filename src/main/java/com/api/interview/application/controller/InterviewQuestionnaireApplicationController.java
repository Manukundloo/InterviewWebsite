package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.InterviewQuestionnaireApplicationService;

@Controller
public class InterviewQuestionnaireApplicationController {

	@Autowired
	private InterviewQuestionnaireApplicationService interviewQuestionnaireApplicationService;

	@RequestMapping(value = "/interviewquestions", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return interviewQuestionnaireApplicationService.welcome();

	}

}
