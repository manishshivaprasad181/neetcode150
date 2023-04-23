import java.util.HashMap;
import java.util.Collections;
import java.util.*;
class Solution {
    public List<Integer> nums;
    public int[] sums;
    public int possiblesquareside;
    public Solution(){
        this.sums=new int[4];
    }
    public boolean dfs(int index){
        if(index==this.nums.size()){
            return sums[0]==sums[1] && sums[1]==sums[2] && sums[2]==sums[3];
        }
        int element=this.nums.get(index);
        for(int i=0;i<4;i++){
            if(this.sums[i]+element<=this.possiblesquareside){
                this.sums[i]+=element;
                if(this.dfs(index+1)){
                    return true;
                }
                this.sums[i]-=element;
            }
        }
        return false;
    }
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks==null||matchsticks.length==0)
        return false;
        int l=matchsticks.length;
        int perimeter=0;
        for(int i=0;i<l;i++)
        {
            perimeter+=matchsticks[i];
        }
        this.possiblesquareside=perimeter/4;
        if(this.possiblesquareside*4!=perimeter){
            return false;
        }
        this.nums=Arrays.stream(matchsticks).boxed().collect(Collectors.toList());
        Collections.sort(this.nums,Collections.reverseOrder());
        return this.dfs(0);
    }
}
