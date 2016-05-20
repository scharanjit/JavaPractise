/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imaginea.javapractise.JAVAPUZZLES2016;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author charanjits
 */
public class Google {
    public static Set<Person> getBestFirendsClique(Person person){
    Set<Person> result = Sets.newHashSet(person);
    while((person.bestFriend != null ) && result .add((Person) person.bestFriend)){
    person=(Person) person.bestFriend;
    }
    return result;
    }
    
    
    public static void main(String[] args) {
        
        getBestFirendsClique(new Person());
        
        
        Map<String,Object> collection= new TreeMap<>();
        System.out.println(collection.compute("foo", (k,v)-> (v==null)? new ArrayList<Object>():((List)v).add("bar")));
        System.out.println(collection.compute("foo", (k,v)-> (v==null)? new ArrayList<Object>():((List)v).add("ber")));
        
        
        
    }
 
}
/*
So what are we seeing here? We have a method that returns a set containing a “clique” of a person’s best friends. We see that there’s a loop that checks if a person has a best friend, and adds them to the results set. If a person indeed has a best friend, it repeats the process for them, so we end up having a set of best friends until we reach a person who doesn’t have a best friend OR that its best friend is already in the set. That last part might be a bit tricky – we can’t add a person who is already in the set so there’s no potential for an infinite loop.

The problem here is that we’re risking an out of memory exception. There’s no bound on the set so we can keep adding and adding people until we run out of memory.

By the way, if you’re into Google Guava, check out this post we wrote about 
*/

/*Alright, compute looks up a value in the map. If it’s null, it adds it and returns its value. Since the list is empty, “foo” doesn’t exist, v is null, and we map “foo” to a new ArrayList<Object>(). The ArrayList is empty, so it prints out [].

For the second line, “foo” does exist in the map so we evaluate the expression on the right. The ArrayList is cast to a List successfully, and “ber” is added to it. add returns true and that’s what it prints out.

The correct answer is [] true.*/