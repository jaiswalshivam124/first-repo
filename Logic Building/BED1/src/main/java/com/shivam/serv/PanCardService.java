package com.shivam.serv;


import com.shivam.da.*;
import com.shivam.mod.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PanCardService

{
	
	
	
	public int cS(String pN)
	{
		
		
		// counting
		
		int pV=6;
	
		
		//instantiation		
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      
	    PanCardDao dao=context.getBean("pancarddao",PanCardDao.class);  
	          
	    
	   //getting the pc
	    PanCard pc =  dao.getPanCardGr(pN);
	    
	    
	  
	    if(pc == null) {
	    	pV = 6;
	    }
	    
	    
	    
	    
	    // checks greater than 5
	    else if(pc.getcS()>=5) {
	    	pV = 5;
	    }
	    
	    
	    
	 
	    else if(pc.getcS()<5) {
	    	pV = 4;
	    }
	    
	    
	  
	  
		return pV; 
			
	}


	}


