package queue;

public class Producer {
    private final int limit;
    private int previousReturned = -1;

    public Producer(int limit) {
        this.limit = limit;
    }

    public int getNextInt(){
        previousReturned += 1;
       if(previousReturned <= limit){
           return previousReturned;
       }
       else {
           previousReturned = 0;
           return 0;
       }
    }

}
