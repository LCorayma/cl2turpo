package cibertec.edu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cibertec.edu.modelo.Personal;
import cibertec.edu.service.PersonalService;

@Controller
@RequestMapping("/lista")
public class PersonalController {

protected final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private PersonalService personalService;
	
	@GetMapping({"/index","/","","/lista"})
	private String index(Model modelo) {
		String title = "LISTADO";
		modelo.addAttribute("titulo",title);
		
		Personal personalObj = this.personalService.getOnePersonal(1L);
		
		modelo.addAttribute("personal", personalObj);
		
		logger.info("Objeto recuperado con exito!");
		return "index";
	}

}
