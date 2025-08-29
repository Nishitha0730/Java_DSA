package Data_Structure;

public class myQueue {
    public static void main(String[] args){
        Queue queue = new Queue(5);

        queue.enQueue(12);
        queue.enQueue(24);
        queue.enQueue(36);
        queue.enQueue(48);
        queue.enQueue(60);
        System.out.println("Front element: " + queue.peek());
    }

    public static class Queue{
        private int front;
        private int rear;
        private int capacity;
        public int count;
        private int[] array;

        public Queue(int capacity){
            front = 0;
            rear = 0;
            this.capacity = capacity;
            array = new int[capacity];
        }

        public int enQueue(int data){
            if(isFull()){
                throw new IllegalStateException("Queue is full");
            }
            array[rear] = data;
            rear = (rear + 1) % capacity;
            count++;
            return data;
        }

        public int deQueue(){
            if(isEmpty()){
                throw new IllegalStateException("Queue is empty");
            }
            int data = array[front];
            front = (front + 1) % capacity;
            count--;
            return data;
        }

        public int peek(){
            if(isEmpty()){
                throw new IllegalStateException("Queue is empty");
            }
            return array[front];
        }

        public boolean isFull(){
            return capacity==count;
        }

        public boolean isEmpty(){
            return count==0;
        }
    }
}
