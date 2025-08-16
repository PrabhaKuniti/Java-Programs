class AddTwoNumbers{
    static class ListNode{int val;ListNode next;ListNode(int v){val=v;}}
    static ListNode addTwoNumbers(ListNode a,ListNode b){
        ListNode d=new ListNode(0),c=d;int carry=0;
        while(a!=null||b!=null||carry!=0){
            int s=carry+(a!=null?a.val:0)+(b!=null?b.val:0);
            c.next=new ListNode(s%10);carry=s/10;c=c.next;
            if(a!=null)a=a.next;if(b!=null)b=b.next;
        }
        return d.next;
    }
    public static void main(String[] args){
        ListNode x=new ListNode(2);x.next=new ListNode(4);x.next.next=new ListNode(3);
        ListNode y=new ListNode(5);y.next=new ListNode(6);y.next.next=new ListNode(4);
        System.out.println(addTwoNumbers(x,y).val);
    }
}
