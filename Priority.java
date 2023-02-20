import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;


class Priority 
    {
       /* public static void main(String[] args) {
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
           
          
            System.out.println(queue.poll());
            printlist(queue);
        
        }
        public static void printlist(PriorityQueue<Integer>queue)
        {
            for (int ele : queue) {
                System.out.println(ele);
                
            }

        }*/ 
        public static void main(String[] args) {
            PriorityBlockingQueue<String>queue=new PriorityBlockingQueue<>();
            queue.add("sai");
            queue.add("sai");
            queue.add("manohar");
           
            System.out.println(queue.poll());

        }
        public static void printlist(PriorityBlockingQueue<String>queue)
        {
            for(String ele:queue)
            {
                System.out.println(ele);
            }
        }

    }
