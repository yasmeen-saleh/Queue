public class ArrayQueue<E> implements Queue<E>{
    private int size=0;
    private int front=0;
    static final int CAPACITY =10;
    E []data;

    public ArrayQueue(int cap) {
        data = (E[]) new Object[cap];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E first() {
        if(isEmpty())return null;
        return data[front];
    }

    @Override
    public void enqueue(E e) {
        if(size()==data.length)
            throw new IllegalStateException("Queue is full");
        int x=(front+size)%data.length;
        data[x]=e;
        size++;

    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;
        E delet= data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
        return delet;
    }

    public void print() {
        if(!isEmpty()){
            int count = 0;
            while(count!=size){
                System.out.println(data[count]);
                count++;
            }}
    }

    public void rotate(){
        if(!isEmpty()){
        E temp=data[0];
        for (int i = 0; i < size; i++) {
            data[i]=data[i+1];
        }
    data[size-1]=temp;}
    }

    public void concat(ArrayQueue q){
        if(!isEmpty()){
            while(!q.isEmpty()){
                enqueue((E) q.dequeue());
            }}
    }

    public void clone(ArrayQueue q){
        if(!isEmpty()){
            for (int i = 0; i < size; i++) {
                q.data[i]=data[i];}
                        }}

    public E josephus(ArrayQueue<E> queue, int k) {
         if (queue.isEmpty( )) return null;
         while (queue.size( ) > 1) {
             for (int i=0; i < k-1; i++)
             queue.rotate();
             E e = queue.dequeue( );
             System.out.println(" " + e + " is out");
             }
         return queue.dequeue( );
         }

}
