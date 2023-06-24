class MovingAverage {
    private int size;
    private Queue<Integer> window;
    private double sum;

    public MovingAverage(int size) {
        this.size = size;
        this.window = new LinkedList<>();
        this.sum = 0.0;
        
        
        
        
    }
    
    public double next(int val) {
        if(window.size()==size) {
            sum-= window.poll();
            
        }
        window.offer(val);
        sum+= val;
        
        return sum/window.size();
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
