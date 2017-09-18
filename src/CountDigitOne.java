
public class CountDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CountOnes(10);
	}
	public static int CountOnes(int n) {
		
		int countones = 0;
        String strn = ""+n;
        int[]  digit_arr = new int[strn.length()+1];
        digit_arr[0] = 0;
        int digit = 0;
        int exp = 0;
        int subtractor = 0;
        int sum2=0;
        
        if (n <= 0){
            
            return countones;
        }
        else{
            
            int sum = 0;
            // initialize array step
            for(int i=1; i<=strn.length(); i++){
                
                digit_arr[i]= (int) Math.pow(10,i-1) + 9*(sum);
                sum2 = sum;
                sum += digit_arr[i];
                
                digit = Character.getNumericValue(strn.charAt(strn.length()-i));
                
                if (digit == 1){
                    subtractor = (int)Math.pow(10,exp);
                    countones += sum2 + (n%subtractor)+1;
                }
                else if (digit == 0){
                    
                }
                else{
                    countones += (int)Math.pow(10,exp)+(digit*sum2);
                }
                exp++;
            }
           
            return countones;   
        }
	}
}
    


