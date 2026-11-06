public class Ant {
   private int numVisited = 0;
   private int[] visited;
   private int[] path;
   private int curretNode;

   public Ant(int node, int numNodes){
      curretNode = node;
      visited = new int[numNodes];
      path = new int[numNodes];
   }

   /*Calculate the probability of moving to every node and then select one at random.
   Set the visited node to visited, Add the node to the current path and increment the numVisited. 
   */
   public void makeMove(){

   }

   public int[] getPath(){
      return path;
   }



   
}
