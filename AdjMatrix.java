class AdjMatrix{
    public static void AdjcMatrix(int[][] edges,int nodes){
        int[][] matrix=new int[nodes][nodes];
        // matrix is adjacency matrix 
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            matrix[u][v]=1;
        }
       for(int i=0;i<nodes;i++){
           for(int j=0;j<nodes;j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
    }
    public static void main(String args[]){
        int[][] edges={{0,1},{0,2},{1,0},{2,1}}; //Edges stored in nX2 matrix,n=no of edges
        AdjcMatrix(edges,3);
    }
}