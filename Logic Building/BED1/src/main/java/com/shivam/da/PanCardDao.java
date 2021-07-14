package com.shivam.da;
import com.shivam.mod.*;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class PanCardDao
{
	
	
	HibernateTemplate template;  

	//creating the  template of  hibernate
	
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}   
	
	
	

	
	//get method
	public PanCard getPanCardGr(String pN){  
		
		
		
		
		//returning 
		
		
	    return (PanCard)template.get(PanCard.class,pN);  
	     
	}  
}
