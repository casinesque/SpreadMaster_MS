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
	logger.info("Has been called getOnePoemITA ");
	try {
		Poem returnedPoem =  getOneITAService.getOnePoemITA().get();
		logger.info("Ho restituito la poesia: "+returnedPoem.getId());
		return new ResponseEntity<Poem>(returnedPoem, HttpStatus.OK);
	}catch (Exception e) {
		
	}
	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	

}


}