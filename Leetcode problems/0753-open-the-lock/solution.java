class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadend=new HashSet<>();
        for(String str:deadends)
        deadend.add(str);
    
    if(deadend.contains("0000"))
    return -1;
    Queue<Pair<String,Integer>> q=new LinkedList<>();
    q.add(new Pair<>("0000",0));
    Set<String> visit=new HashSet<>(deadend);
    while(!q.isEmpty())
    {
        Pair<String,Integer> p=q.poll();
        String lock=p.getKey();
        int turns=p.getValue();
        if(lock.equals(target))
        return turns;
        for(String str:children(lock))
        if(!visit.contains(str))
        {
            visit.add(str);
            q.add(new Pair<>(str,turns+1));
        }
    }
    return -1;
}
public List<String> children(String lock)
{
    
    List<String> children = new ArrayList<>();
    for(int i=0;i<4;i++)
    {
        int digit=Integer.parseInt(String.valueOf(lock.charAt(i)));
        digit= (digit+1)%10;
        String updatedlock=lock.substring(0,i)+digit+lock.substring(i+1);
        children.add(updatedlock);
        digit=Integer.parseInt(String.valueOf(lock.charAt(i)));
        digit= (digit-1+10)%10;
        updatedlock=lock.substring(0,i)+digit+lock.substring(i+1);
        children.add(updatedlock);
    }
    return children;
}
}
