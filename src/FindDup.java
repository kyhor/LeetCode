
public class FindDup {
	
	public int findDuplicate(int[] nums) {
        
        int found = 0;
        for (int i=0; i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[i]==nums[j]){
                    
                    found = nums[i];
                    return found;
                }
            }
        }
        return found;
        
    }

}
