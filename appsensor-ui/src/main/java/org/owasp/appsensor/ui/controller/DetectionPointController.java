package org.owasp.appsensor.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetectionPointController {

	@RequestMapping(value="/detection-point", method = RequestMethod.GET)
	public String home() {
		return "detection-point";
	}

}