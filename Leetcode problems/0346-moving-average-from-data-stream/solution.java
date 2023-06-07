class MovingAverage {
    Queue<Integer> window;
    int maxsize;
    double sum=0;
    public MovingAverage(int size) {
        window=new LinkedList<Integer>();
        maxsize=size;
        sum=0;
    }
    
    public double next(int val) {
        if(window.size()==maxsize)
        sum-=window.remove();
        window.add(val);
        sum+=val;
        return sum/window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
