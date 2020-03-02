package com.SpreadMasterController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Poem;
import com.Service.GetOneITAService;

@RestController
public class SpreadMasterController {
	private final static Logger logger = LogManager.getLogger(SpreadMasterController.class);

	@Autowired
	GetOneITAService getOneITAService;

@RequestMapping("/")
public String index() {
	return "Congratulations from Controller class";
}

	
@GetMapping(value = "/get")
public ResponseEntity<?> getOnePoemITA () {
	logger.info("E' stata chiamata  getOnePoemITA ");
	try {
		Poem returnedPoem =  getOneITAService.getOnePoemITA().get();
		// AGgiungere che devo ritornare il testo e basta non tutto l'oggetto!
		return new ResponseEntity<Poem>(returnedPoem, HttpStatus.OK);
	}catch (Exception e) {
		
	}
	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	

}


}