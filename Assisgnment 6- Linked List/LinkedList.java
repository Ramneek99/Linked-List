public class LinkedList <T>
{ //MUST IMPLEMENT ALL FUNCTIONS
    Node head;

    public LinkedList()
    {
        head=null;

    }

    public int getLength()
    {
        int count=0;
        Node cursor = this.head;
        while(cursor != null){
            count++;
            cursor = cursor.getnext();
        }
        return count;
    }


    public void addToFront(T toAdd)
    {
        Node node = new Node(toAdd, this.head);
        this.head = node;
    }

    public void addToEnd(T toAdd)
    {
       if(head == null){
         this.head = new Node(toAdd, null);
         return;
       }
        Node cursor = this.head;
        while(cursor.getnext() != null){
            cursor = cursor.getnext();
        }
        Node node = new Node(toAdd, null);
        cursor.setnext(node);
    }


    public T removeFromFront()
    {
      Node r = null;
        if(this.head==null)
            return null;
        else {
          r = head;
           this.head = this.head.getnext();
            return r.getdata();
        }

    }

    public T removeFromEnd()
    {
        if(this.head==null)
            return null;
        else {
            Node cursor = this.head;
            Node previous = null;
            while(cursor.getnext() != null){
                previous = cursor;
                cursor = cursor.getnext();
            }
            if(previous != null){
              previous.setnext(cursor.getnext());
            }else{
              Node temp = head; 
              this.head = null; 
              return temp.getdata();
            }
            return cursor.getdata();
        }

    }

    public boolean removeTarget(T toRemove)
    {
        Node cursor = this.head;
        Node previous = null;
        if(this.head == null){
          return false;
        }
        
        while(cursor != null){
          if(cursor.getdata().equals(toRemove)){
            if(previous != null){
              previous.setnext(cursor.getnext());
            }else{
              this.head = null;
            }
            return true;
          }
          previous = cursor;
          cursor = cursor.getnext();
        }
        return false;
    }


    public String toString()
    {
        String string= "head->";
        Node cursor = this.head;
        while(cursor != null){
            string = string + cursor.toString() + "->";
            cursor = cursor.getnext();
        }
        string += "null";
        return string;
    }

    private class Node
    {
        private T data;
        private Node next;
        Node(T dataPassed, Node nextPassed)
        {
            data=dataPassed;
            next=nextPassed;

        }

        public void setdata(T dataPassed)
        {
            this.data = dataPassed;
        }
        public T getdata()
        {
            return this.data;
        }
        public Node getnext()
        {
            return this.next;
        }
        public void setnext(Node passed)
        {
            next=passed;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }


}