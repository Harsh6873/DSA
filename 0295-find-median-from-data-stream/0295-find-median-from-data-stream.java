class MedianFinder {
    ArrayList<Integer> li;
    public MedianFinder() {
        li = new ArrayList<Integer>();
    }
    public void addNum(int num) {
        int i;
        if(li.size() > 0){
            for (i = 0; (i < li.size()  && li.get(i) < num); i++);
            if(i == -1){
                i = 0;
            }
            li.add(i , num);
        }else{
            li.add(num);
        }
    }
    
    public double findMedian() {
        int temp = li.size()/2;
        if(li.size() % 2 == 0){
            return (double) (li.get(temp) + li.get(temp - 1))/2;
        }else{
            return li.get(temp);
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */