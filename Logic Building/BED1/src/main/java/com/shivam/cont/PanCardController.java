package com.shivam.cont;

import com.shivam.serv.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("pancard")
public class PanCardController {
	
	
	
	   @RequestMapping(method = RequestMethod.POST)
	   
	   public String cS(String pN)
	   {
		   
		   String pN1 = pN.toUpperCase();
		   
		   
		   
		   //creating a object
		   PanCardService creditcardService = new PanCardService();
		   
		   int pV =creditcardService.cS(pN1);
		   String rJ = "";
		  //checking the condtions
		   
		   
		  if(pV==5)
		  {
			  rJ ="Eligible";
		  }
		  
		  
		  if(pV==4)
		  {
			  rJ ="NotEligible";
		  }	
		  
		  
		  
		  if(pV==6)
		  {
			  rJ ="Invalid";
		  }
		  
		// returning the jsp page 
	      return rJ;
	   }
}
