class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivebills=0;
        int tenbills=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                fivebills++;
            }
            else if(bills[i]==10)
            {
                tenbills++;
                if(fivebills==0)
                {
                    return false;
                }
                else
                fivebills--;
            }
            else
            {
                if(tenbills>0 && fivebills>0)
                {
                    tenbills--;
                    fivebills--;
                }
                else if(tenbills==0 && fivebills>=3)
                {
                    fivebills=fivebills-3;
                }
                else if(tenbills==0 && fivebills<3)
                return false;
                else if(tenbills>0 && fivebills==0)
                return false;
                else
                return false;
            }
        }
        return true;
        }
        
    }

