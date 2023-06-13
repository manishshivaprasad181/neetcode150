class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
        return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        Set<Pair<Integer,Integer>> visit=new HashSet<>();
        int islands=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1' && !visit.contains(new Pair<>(i,j)))
                {
                    bfs(i,j,grid,visit,rows,cols);
                    islands+=1;
                }
            }
        }
        return islands;
    }
    public void bfs(int i,int j,char[][] grid,Set<Pair<Integer,Integer>> visit,int rows,int cols){
        Queue<Pair<Integer,Integer>> q=new ArrayDeque<>();
        visit.add(new Pair<>(i,j));
        q.add(new Pair<>(i,j));
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> pair=q.poll();
            int row=pair.getKey();
            int col=pair.getValue();
            int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
            for(int [] direction:directions){
                int dr=direction[0];
                int dc=direction[1];
                int nr=row+dr;
                int nc=col+dc;
                if(nr>=0 && nr<rows && nc>=0&& nc<cols&& grid[nr][nc]=='1'&&!visit.contains(new Pair<>(nr,nc))){
                    q.add(new Pair<>(nr,nc));
                    visit.add(new Pair<>(nr,nc));
                }
            }
                
            }
        }
    }

