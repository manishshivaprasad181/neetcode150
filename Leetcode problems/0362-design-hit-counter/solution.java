class HitCounter {
    public Queue<Integer> hits;

    public HitCounter() {
        hits = new LinkedList<Integer>();
    }
    
    public void hit(int timestamp) {
        hits.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        while(!hits.isEmpty()) {
            if(timestamp-hits.peek()>=300)  
                hits.remove();
            else 
                break;
        }   
        return hits.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
