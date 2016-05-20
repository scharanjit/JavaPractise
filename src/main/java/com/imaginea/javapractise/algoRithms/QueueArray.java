/*
IT WONT GIVE CORRECT RESULTS

LOT OF MANIPULAYTION REQUIRED
 */

package algoRithms;

/**
 *
 * @author Charanjit.Singh
 */
public class QueueArray {
    public static void main(String[] args) throws Exception {
         QueueArrayImple q = new QueueArrayImple();
         System.out.println("size : "+q.size());
         q.enQueue(568);
         q.enQueue(12);
         q.enQueue(200);
         q.enQueue(32);
         q.enQueue(56);
         System.out.println("size : "+q.size());
         System.out.println(q.front());
         System.out.println(q.deQueue());
         System.out.println(q.deQueue());
         System.out.println(q.deQueue());
         System.out.println(q.isEmpty());
         System.out.println(q.deQueue());
          System.out.println(q.isEmpty());
         
    }
    
}
