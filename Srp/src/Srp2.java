
public class QueueviaLinkedList extends LinkedList {

	LinkedList L=new LinkedList();
	int tail=0;
	public QueueviaLinkedList()
	{
		this.tail=0;
		L.head=null;
	}
	public void enqueue(QueueviaLinkedList a,int i)
	{
		Node inserted=new Node(i);
		tail++;
		if(a.head==null)
		{
			a.head=inserted;
		}
		else 
		{
			inserted.next=a.head;
			a.head.prev=inserted;
			a.head=inserted;
			inserted.prev=null;
			
		}
	}
	public void dequeue(QueueviaLinkedList a)
	{
		Node tmp=a.head;
		if(a.tail==0)
		{
			System.out.println("Your queue is empty");
		}
		else
		{
			while(tmp!=null)
			{
				tmp=tmp.next;
			}
			tmp=a.head;
			for(int i=0;i<tail-1;i++)
			{
				tmp=tmp.next;
			}
			tail--;
			System.out.println(tmp.key);
			
		}
	}
	public static void main(String [] args)
	{
		QueueviaLinkedList a=new QueueviaLinkedList();
		a.enqueue(a, 5);
		a.enqueue(a, 10);
		a.dequeue(a);
		a.dequeue(a);
		a.dequeue(a);
	}
}

