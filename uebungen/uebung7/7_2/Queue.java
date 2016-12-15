/* ************************************************************************** *\
 * *                 Programmierung 1 HS 2016 - Serie 7-2  
 * *                 Bachofner Marc      15-135-916
 * *                 Dominique Roux      16-100-661
 * \* ************************************************************************ */


public class Queue<S>
{
    QueueNode rear;
    QueueNode front;
    int size;
    
    public Queue()
    {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }
    
    public S dequeue() throws EmptyQueueException
    {
        if (this.isEmpty())
            throw new EmptyQueueException();
        
        S ret = front.element;
        
        if (this.size == 1)
        {
            this.rear = null;
            this.front = null;
        }
        else
        {
            QueueNode newFront = front.prev;
            front.prev = null;
            newFront.next = null;
            this.front = newFront;
        }
        
        this.size--;
        
        return ret;
    }
    
    public void enqueue(S element)
    {
        QueueNode newQueueNode = new QueueNode(element, this.rear, null);
        
        if (this.size == 0)
        {
            this.rear = newQueueNode;
            this.front = newQueueNode;
        }
        else
        {
            this.rear.prev = newQueueNode;
            this.rear = newQueueNode;
        }
        
        this.size++;
    }
    
    public boolean isEmpty()
    {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    private class QueueNode
    {
        S element;
        QueueNode next;
        QueueNode prev;

        public QueueNode(S element, QueueNode next, QueueNode prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
