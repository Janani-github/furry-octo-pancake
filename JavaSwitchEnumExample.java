public class JavaSwitchEnumExample 
{      
       public enum WorkingDays {Mon, Tue, Wed, Thu, Fri, Sat}    

       public static void main(String args[])    
       {    
         	WorkingDays[] wDays = WorkingDays.values();    

	        for(int i=wDays.length-1;i>=0;i--)    
        	{    
                	switch(wDays[i])    
	                {      
	                    case Mon:    
        	                System.out.println("Monday");    
                	        break;    
	                    case Tue:    
        	                System.out.println("Tuesday");    
                	        break;         
	                    case Wed:    
        	                System.out.println("Wednesday");    
                	        break;    
	                    case Thu:    
        		        System.out.println("Thursday");    
                        	break;    
	                    case Fri:    
                        	System.out.println("Friday");    
                        	break;    
                    	    case Sat:    
                        	System.out.println("Saturday");    
	                        break;    
        	        } //sw   
            	}//for    
        }//main    
}//class    

