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
       
   }


}
