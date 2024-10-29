import java.util.Comparator;

public class PriorityQueue<T> extends Queue<T>
{

   Comparator<T> compare;

   public PriorityQueue(Comparator<T> comp)
   {
      compare = comp;
      head = null;
   }
   
    //@Override
   public void push(T val)
   {
	   Node nn = new Node(val,null);
       if(head==null) // if the queue is empty
       {
    	   head = new Node(val,null);
       }
       
       if(compare.compare(val,head.val)>0) // if the newbie is greater than head
       {
    	   nn.next = head;
    	   head = nn;
       }
       
       else {
    	   Node curr = head;
    	   while(compare.compare(val, curr.next.val) < 0 && curr.next != null)
    	   {
    		   curr = curr.next;
    	   }
    	   nn.next = curr.next;
    	   curr.next = nn;
       }
   }
}
