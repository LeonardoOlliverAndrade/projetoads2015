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
 
    public boolean valido(String p){
        for (int li =0; li<3; li++){
            for (int co =0; co<3; co++)
                if (m[li][co].equals(p))
                
                    return true;
                
        }
       return false;
        
    }
  public void Jogada(String p, String j){
           
       
        if(p.equals("1"))
            m[0][0] = j;
        else if(p.equals("2"))
            m[0][1] = j;
        else if(p.equals("3"))
            m[0][2] = j;
        else if(p.equals("4"))
            m[1][0] = j;
        else if(p.equals("5"))
            m[1][1] = j;
        else if(p.equals("6"))
            m[1][2] = j;
        else if(p.equals("7"))
            m[2][0] = j;
        else if(p.equals("8"))
            m[2][1] = j;
        else if(p.equals("9"))
            m[2][2] = j;
    }

}