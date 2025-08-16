class ReorderList{
    static class ListNode{int val;ListNode next;ListNode(int v){val=v;}}
    static void reorderList(ListNode h){
        if(h==null||h.next==null)return;
        ListNode s=h,f=h;
        while(f.next!=null&&f.next.next!=null){s=s.next;f=f.next.next;}
        ListNode p=null,c=s.next;s.next=null;
        while(c!=null){ListNode n=c.next;c.next=p;p=c;c=n;}
        ListNode a=h,b=p;
        while(b!=null){ListNode n1=a.next,n2=b.next;a.next=b;b.next=n1;a=n1;b=n2;}
    }
    public static void main(String[] args){
        ListNode a=new ListNode(1);a.next=new ListNode(2);a.next.next=new ListNode(3);a.next.next.next=new ListNode(4);
        reorderList(a);System.out.println(a.next.val);
    }
}
