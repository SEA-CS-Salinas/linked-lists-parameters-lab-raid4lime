//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
       while(list != null)
       {
          
       System.out.print(list.getValue() + " ");
       list = list.getNext();
       }
       System.out.println();
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
   	int count = 0;
   	while(list != null)
   	{
   	    count++;
   	    list = list.getNext();
   	}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
	    if(list != null){
	        list.setNext(new ListNode(list.getValue(), list.getNext()));
	    }
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
	    if(list == null) return;
	    ListNode temp = list;
	    
	    while(temp.getNext() != null)
	    {
	        temp = temp.getNext();
	}
	 temp.setNext(new ListNode(temp.getValue(), null));
}
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
	    while(list != null && list.getNext() != null) {
	        list.setNext(list.getNext().getNext());
	       list = list.getNext();
	    }
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count = 1;
        while (list != null)
        {
            if (count == x || count == 4)
            {
                list.setValue(value);
            }
            count++;
            list = list.getNext();
        }
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
	    if(list == null || x <= 0) return;
	    int count = 1;
	    ListNode prev = null;
		while(list != null)
		{
		    if(count == x) 
		    {
		        if(prev != null)
		        {
		            prev.setNext(list.getNext());
		        }
		        else
		        {
                list = list.getNext();
		       
		    }
		     count = 0; 
		    }
		    prev = list;
        list = list.getNext();
        count++;
	
	}		
	}
}
