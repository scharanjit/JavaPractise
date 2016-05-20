/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ivy.com.org.thread;

/**
 *
 * @author charanjit.singh
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
 
public class ThreadSafeIteratorExample {
 
    public static void main(String[] args) {
 
        List<String> myList = new CopyOnWriteArrayList<String>();
 
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
 
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")){
                myList.remove("4");
                myList.add("6");
                myList.add("7");
            }
        }
        System.out.println("List Size:"+myList.size());
 
        Map<String,String> myMap = 
             new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("1")){
                myMap.remove("3");
                myMap.put("4", "4");
                myMap.put("5", "5");
            }
        }
 
        System.out.println("Map Size:"+myMap.size());
    }
 
}

/*
From the output stack trace, its clear that the exception is coming when we call iterator next() function. If you are wondering how Iterator checks for the modification, its implementation is present in AbstractList class where an int variable modCount is defined that provides the number of times list size has been changed. This value is used in every next() call to check for any modifications in a function checkForComodification().
Now comment the list part and run the program again.
Output will be:
1
Map Value:3
2
Map Value:2
3
Map Value:4
Since we are updating the existing key value in the myMap, its size has not been changed and we are not getting ConcurrentModificationException. Note that the output may differ in your system because HashMap keyset is not ordered like list. If you will uncomment the statement where I am adding a new key-value in the HashMap, it will cause ConcurrentModificationException.
To Avoid ConcurrentModificationException in multi-threaded environment:
1. You can convert the list to an array and then iterate on the array. This approach works well for small or medium size list but if the list is large then it will affect the performance a lot.
2. You can lock the list while iterating by putting it in a synchronized block. This approach is not recommended because it will cease the benefits of multithreading.
3. If you are using JDK1.5 or higher then you can use ConcurrentHashMap and CopyOnWriteArrayList classes. It is the recommended approach.
To Avoid ConcurrentModificationException in single-threaded environment:
You can use the iterator remove() function to remove the object from underlying collection object. But in this case you can remove the same object and not any other object from the list.


From the above example its clear that:
1. Concurrent Collection classes can be modified avoiding ConcurrentModificationException.
2. In case of CopyOnWriteArrayList, iterator doesn’t accomodate the changes in the list and works on the original list.
3. In case of ConcurrentHashMap, the behavior is not always the same.
For condition:
1
if(key.equals("1")){
2
    myMap.remove("3");
Output is:
1
Map Value:1
2
Map Value:null
3
Map Value:4
4
Map Value:2
5
Map Size:4
It is taking the new object added with key “4? but not the next added object with key “5?.
Now if I change the condition to
1
if(key.equals("3")){
2
    myMap.remove("2");
Output is:
1
Map Value:1
2
Map Value:3
3
Map Value:null
4
Map Size:4
In this case its not considering the new added objects.
So if you are using ConcurrentHashMap then avoid adding new objects as it can be processed depending on the keyset. Note that the same program can print different values in your system because HashMap keyset is not in any order.
Extra Toppings:
1
for(int i = 0; i<myList.size(); i++){
2
    System.out.println(myList.get(i));
3
    if(myList.get(i).equals("3")){
4
        myList.remove(i);
5
        i--;
6
        myList.add("6");
7
    }
8
}
If you are working on single-threaded environment and want your code to take care of the extra added objects in the list then you can do so using following code and avoiding iterator.
Note that I am decreasing the counter because I am removing the same object, if you have to remove the next or further far object then you don’t need to decrease the counter.

*/