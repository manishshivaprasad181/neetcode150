class Solution {
    public int countComponents(int n, int[][] edges) {
        int components = 0;
        boolean[] visited = new boolean[n];
        
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i =0;i<n;i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                components++;
                dfs(adjList, visited, i);
            }
        }
        return components;
    }
    private void dfs(List<List<Integer>> adjList, boolean[] visited, int startNode) {
        visited[startNode] = true;
        
        for(int neighbor: adjList.get(startNode))  {
            if(!visited[neighbor]) {
                dfs(adjList, visited, neighbor);
            }
        }
    }
    
}
