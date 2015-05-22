package jogodavelha;


public class JV {
   private String [][] m = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
     
   private int li = 0;
   private int co = 0;
   private Object p;
    
  
    public String Mostrar() {
	for (int li = 0; li <3; li ++ ){
	    for (int co = 0; co <3; co ++ ){
              
				
				 
		System.out.printf("   "+ m [li][co]);
					
		}
			
	        System.out.println("\n");
		}
	        return  null;
			
    }
}  
