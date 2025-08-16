class LinkedListCycle{
    static class ListNode{int val;ListNode next;ListNode(int v){val=v;}}
    static boolean hasCycle(ListNode h){
        ListNode s=h,f=h;
        while(f!=null&&f.next!=null){s=s.next;f=f.next.next;if(s==f)return true;}
        return false;
    }
    public static void main(String[] args){
        ListNode a=new ListNode(1);a.next=new ListNode(2);a.next.next=a;
        System.out.println(hasCycle(a));
    }
}
