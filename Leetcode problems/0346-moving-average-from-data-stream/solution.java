class MovingAverage {
    private Queue<Integer> window;
    private int maxSize;
    private double sum;

    public MovingAverage(int size) {
       window = new LinkedList<>();
       maxSize = size;
        sum =0.0;
    }
    
    public double next(int val) {
        if(window.size() == maxSize)
            sum-= window.poll();
        sum+= val;
        window.offer(val);
        return sum/window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
