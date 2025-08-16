import java.util.*;
class CourseSchedule{
    static boolean canFinish(int n,int[][] p){
        List<List<Integer>> g=new ArrayList<>();for(int i=0;i<n;i++)g.add(new ArrayList<>());
        int[] indeg=new int[n];
        for(int[] e:p){g.get(e[1]).add(e[0]);indeg[e[0]]++;}
        Deque<Integer> q=new ArrayDeque<>();for(int i=0;i<n;i++)if(indeg[i]==0)q.add(i);
        int cnt=0;
        while(!q.isEmpty()){
            int u=q.poll();cnt++;
            for(int v:g.get(u)) if(--indeg[v]==0) q.add(v);
        }
        return cnt==n;
    }
    public static void main(String[] args){
        System.out.println(canFinish(2,new int[][]{{1,0}}));
    }
}
