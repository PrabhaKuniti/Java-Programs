class ReverseLinkedList{
    static class ListNode{int val;ListNode next;ListNode(int v){val=v;}}
    static ListNode reverseList(ListNode h){
        ListNode p=null,c=h;
        while(c!=null){ListNode n=c.next;c.next=p;p=c;c=n;}
        return p;
    }
    public static void main(String[] args){
        ListNode a=new ListNode(1);a.next=new ListNode(2);a.next.next=new ListNode(3);
        System.out.println(reverseList(a).val);
    }
}
