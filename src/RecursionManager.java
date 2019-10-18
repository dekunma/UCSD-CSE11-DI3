class RecursionManager {
    public int k;
    public void triangleSum(int[] nums, int k){
        int length = nums.length;
        if(length < k){
            return;
        }
        if(length == k){
            int sum = 0;
            for (int i = 0;i < length;i++){
                sum += nums[i];
            }
            System.out.println("_"+sum+"_");
        }
        else{
            int[] newNums = new int[length-k+1];
            for(int i = 0;i < newNums.length;i++){
                for (int j = 1;j <= k;j++){
                    newNums[i] += nums[length - i -j ];
                }
            }
            System.out.println(printFormattedArray(newNums));
            triangleSum(newNums,k);
        }
    }

    public String printFormattedArray(int[] nums){
        String result = new String();
        for (int i = 0;i < nums.length;i++){
            result+=("_"+nums[i]);
        }
        result+="_";
        return result;
    }

    public  RecursionManager(int k){
        this.k = k;
    }
}
