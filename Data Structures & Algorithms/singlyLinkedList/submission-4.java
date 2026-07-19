class LinkedList {
    private Node head;
    private int size;

    private class Node{
        Node next;
        int val;

        Node(int val){
            this.val=val;
        }
    }

    public LinkedList() {
        head=null;
        size=0;

    }

    public int get(int index) {
        if(index<0||index>=size)return -1;
        Node temp=head;
        while(index-->0){
            temp=temp.next;
        }
        return temp.val;
        
    }

    public void insertHead(int val) {
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;
        
    }

    public void insertTail(int val) {
        Node n=new Node(val);
        if(head==null){
            head=n;
            size++;
            return;

        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        size++;

    }

    public boolean remove(int index) {
        if(index<0||index>=size)return false;
        if(index==0){
            head=head.next;
            size--;
            return true;
        }
        Node temp=head;
        while(index-->1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
        return true;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> l=new ArrayList();
        Node temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        return l;


    }
}
