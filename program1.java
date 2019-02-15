//minimum coin change Problem

class Solution {
    public int coinChange(int[] coins, int amount) {

        if(amount==0)
            return 0;
        int[] arr = new int[amount+1];
        arr[0]=0;

        for(int i=1;i<amount;i++)
            arr[i]=amount+1;

        for(int i=1;i<amount;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]<=i)
                {
                    int sub_total = arr[i-coins[j]];
                    if(sub_total!=amount+1 && sub_total<arr[i]+1)
                        arr[i]=sub_total+1;
                }
            }
        }


        return arr[amount];
    }
}