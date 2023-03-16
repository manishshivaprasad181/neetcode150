import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Hashtable<Integer,Integer> hs=new Hashtable<>();
        for(int i=0;i<arr.length;i++){
            int mul=arr[i]*2;
            int div=arr[i]/2;
            if(hs.containsKey(mul)||hs.containsKey(div)&& arr[i]%2==0)
                return true;
            else
                hs.put(arr[i],i);
        }
                                                            
        return false;
    }
}
