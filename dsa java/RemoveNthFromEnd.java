class RemoveNthFromEnd{
    static class ListNode{int val;ListNode next;ListNode(int v){val=v;}}
    static ListNode removeNthFromEnd(ListNode h,int n){
        ListNode d=new ListNode(0);d.next=h;ListNode f=d,s=d;
        for(int i=0;i<n;i++) f=f.next;
        while(f.next!=null){f=f.next;s=s.next;}
        s.next=s.next.next;
        return d.next;
    }
    public static void main(String[] args){
        ListNode a=new ListNode(1);a.next=new ListNode(2);a.next.next=new ListNode(3);
        System.out.println(removeNthFromEnd(a,2).val);
    }
}
