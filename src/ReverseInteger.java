
public class ReverseInteger {
	public int reverse(int x) {
        
        String xstr = "" + x;
        
        String reverse = "";
        int im =0;
        
        if (x>2147483647 || x<-2147483648){
            
            return 0;
        }
        
        else if (x>=0){//pos case
            
            for (int i = xstr.length() -1; i>=0; i--){
                
                reverse+= xstr.charAt(i);
                
                
                
            }
            try{
                im = Integer.parseInt(reverse);
            }catch(NumberFormatException ex){ // handle your exception
 
            }
            return im;
        }
            
        else{
            
            for (int i = xstr.length() -1; i>0; i--){
                
                reverse+= xstr.charAt(i);
       
            } 
            
            try{
                im = Integer.parseInt(reverse);
            }catch(NumberFormatException ex){ // handle your exception
 
            }
            //return Integer.parseInt(reverse)*(-1);
            return -1*im;   
        }
        
    }
	
}
