
public class ZigZag {
	
	public String convert(String s, int numRows) {
        
        String[] rows = new String[numRows];
        int row = -1;
        boolean up = true;
        String end = "";
        if (numRows == 1){
        	
        	return s;
        	
        }
        else{
	        for (int i =0; i<numRows; i++){
	            
	            rows[i]= "";
	        }
	        
	        for (int j =0; j< s.length(); j++){
	            
	            if(up  && row<numRows-1){
	                
	                row ++;          
	                
	            }
	            else if (numRows-1 == row){
	                
	                up = false;
	                row--;
	            }
	            else if (row == 0){
	                up = true;
	                row++;
	            }
	            else{
	                row--;
	            }
	            rows[row]+= s.charAt(j);
	            
	        }
	        
	        for (int i =0; i<numRows; i++){
	            
	            end += rows[i];
	        }
	        
	        return end;
        }
        
    }
}
