class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        return compareRevisions(v1, v2, 0);   
    }
    private int compareRevisions(String[] v1, String[] v2, int index) {
        int num1=0;
        int num2=0;
        if(index>= v1.length && index >= v2.length)
            return 0;
        else if(index>=v1.length){
            if(Integer.parseInt(v2[index])==0)
                return compareRevisions(v1, v2, index+1);
            else
                return -1;
        } else if(index>=v2.length) {
            if(Integer.parseInt(v1[index])==0) 
                return compareRevisions(v1, v2, index+1);
            else 
                return 1;
        } else
             num1 = Integer.parseInt(v1[index]);
             num2 = Integer.parseInt(v2[index]);
        
            if(num1<num2)
                return -1;
            else if(num1>num2)
                return 1;
        
            else
                return compareRevisions(v1,v2, index+1);
    
    }
}
