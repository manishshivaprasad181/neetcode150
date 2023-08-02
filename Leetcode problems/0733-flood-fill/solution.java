class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor = image[sr][sc];
        if(oldcolor!=color) dfs(image, sr, sc, oldcolor, color);
        return image;

      
    }
    private void dfs(int[][] image, int sr,int sc, int oldcolor, int color) {
        if(image[sr][sc]==oldcolor) {
            image[sr][sc] = color;
            if(sr>=1) dfs(image, sr-1,sc, oldcolor, color);
            if(sc>=1) dfs(image, sr, sc-1, oldcolor, color);
            if(sr<image.length-1) dfs(image, sr+1, sc, oldcolor, color);
            if(sc<image[0].length-1) dfs(image, sr, sc+1, oldcolor, color);
        }
    }
    
}
