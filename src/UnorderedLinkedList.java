
public class UnorderedLinkedList 
{
	private Node head;
	private Node curr;
	private Node tail;
	private int count;
	
	public UnorderedLinkedList()
	{
		count = 0;
		head = tail = curr = new Node(null,null,null);
	}
	private void append(String key, String element)
	{
		tail = tail.setNext(new Node(key,element,null));
		count++;
	}
	private void moveToStart()
	{
		curr = head;
	}
	private void moveToEnd()
	{
		curr = tail;
	}
	private int length()
	{
		return count;
	}
	private void next()
	{
		if(curr != tail)
			curr = curr.getNext();
	}
	private void prev()
	{
		if(curr == head)
			return;
		Node temp = head;
		while(temp.getNext() != curr)
		{
			temp = temp.getNext();
			curr = temp;
		}
			
		
	}
	private Node getValue()
	{
		if(curr.getNext() == null)
		{
			return null;
		}
		else
			return curr.getNext();
	}
	public void clear()
	{
		head.setNext(null);
	}
	public void insert(String key, String element)
	{
		curr.setNext(new Node(key,element,curr.getNext()));
		if(tail == curr)
		{
			tail = curr.getNext();
		}
		count++;
		
	}
	public String remove(String key)
	{
		if(curr.getNext() == null)
		{
			return null;
		}
		String it = curr.getNext().getValue();
		if(tail == curr.getNext().getNext())
		{
			curr.setNext(curr.getNext().getNext());
			count--;
		}
		return it;
	}
	public String removeAny(String key)
	{
		
	}
	public String find(String key)
	{
		
	}
	public int size()
	{
		
	}
}
