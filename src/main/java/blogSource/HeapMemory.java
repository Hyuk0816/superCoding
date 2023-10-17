package blogSource;



public class HeapMemory {
    public static void main(String[] args) {

        Counter c = new Counter();
        two(c);
        int cnt = c.get();
    }
    public static void two(Counter c){
        c.increment();
        c.increment();
    }
}

class Counter{
    private int state;
    public void increment(){state++; }
    public int get(){return state;}
}
