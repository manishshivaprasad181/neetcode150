class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq=new PriorityQueue<>();
        for(char c:s.toCharArray())
        {
            if(isvowel(c))
            pq.add(c);
        }
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(isvowel(c))
            {
                ans.append(pq.poll());
            }
            else
            {
                ans.append(c);
            }

        }
        return ans.toString();
    }
    public boolean isvowel(char c)
    {
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
}
