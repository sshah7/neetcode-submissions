

class MovingAverage {

    private final int size;
    private final List<Integer> window;

    public MovingAverage(int size) {
        this.size = size;
        this.window = new ArrayList<>();
    }
    
    public double next(int val) {
        int sum=0;
        window.add(val);
        if(window.size()>size){
            window.remove(0);
        }
        for(int i : window){
            sum += i;
        }
        return (double) sum/window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */