//given coins of different denomination, computing the minimum number of coins required to make that amount

class Solution {
    public int change(int amount, int[] coins) {

        int[] dp = new int[coins.length];

        for(int coin:coins)
            for(int i=0;i<amount;i++)
            {
                if(i>=coin)
                {
                    arr[i]+=arr[i-coin];
                }
            }

        return arr[amount];

    }}