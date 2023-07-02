package sl_1;

public class LinkedList {

	private Node head;

	public LinkedList() {
		
		this.head=null;
	}

	public boolean insert(String name) 
	{
		Node node=new Node(name);
		
		//if LL is empty
		if(head==null)
		{
			head=node;
			return true;
		}
		
		//if LL is not empty
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();//traversing through LL
		}
		
		temp.setNext(node);
		return true;
	}
	
	
	//insertion byPosition
	
		public void insert(String name,int position)
		{
			Node node=new Node(name);
			
			//if position <0 and node null
			if(position<=0||node==null)
				return;
			Node temp=head;
			
			// position is 1
			if(position==1)
			{
				if(head==null)
				{
					head=node;
					return;
				}
				
				head=node;
				head.setNext(temp);
				
			}
			
			//if position is > 1
			for(int i=1;i<position-1;i++)
			{
				temp=temp.getNext();
			}
			
			
			node.setNext(temp.getNext());
			temp.setNext(node);
			
		}
		
		
		
	public void display() 
	{
		//if list is empty
		if(head==null)
		{
			System.out.println("List is Empty....");
			return;
		}
		
		Node temp=head;
		
		//if LL is not empty, but here for while condition we can not use  temp.getNext as last elem will not be printed....
		while(temp!=null)
		{
			System.out.println(temp.getName()+"");
			temp=temp.getNext();
		}
	}
	
	//delete byPosition
	
	public void delete(int position) {
		
		if(position<=0||head==null)
		{
			return;
		}
		
		if(position==1)
		{
			head=head.getNext();
			return;
		}
		
		Node temp=head;
		for(int i=1;i<position-1;i++)
		{
			
			temp=temp.getNext();
		}
		
		//System.out.println(temp2.getName());
		if(temp.getNext()==null)
			return;
		temp.setNext(temp.getNext().getNext());
	}
	
	
	public boolean reverse() 
	{
	
		
		Node temp=head.getNext();
		head.setNext(null);
		Node temp1=head;
		
		while(temp.getNext()!=null)
		{
			Node temp2=temp.getNext();
			temp.setNext(null);
			head=temp;
			temp=temp2;
			
		}
		
		
		
		
		
		
		return true;
	}
	
	
	
	
}
