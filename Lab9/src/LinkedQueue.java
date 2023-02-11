import java.util.LinkedList;

public class LinkedQueue <E> implements Queue<E> {
    LinkedList<E> list = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.getLast();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);//BECAUSE IT COMES FROM THE FRONT
    }

    @Override
    public E dequeue() {
        try {
            // BECAUSE UTS THE FIRET ELEMENT
            return list.removeFirst();
        } catch (Exception e) {
            return null;

        }
    }

    public void concat(LinkedQueue m){//done
        if(!isEmpty()) {
            int s=m.size();
            while(s!=-1){
                enqueue((E) m.dequeue());
                s--;
            }

        }
    }




}