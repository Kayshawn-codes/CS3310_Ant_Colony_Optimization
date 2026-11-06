public class AntColonyOptimization {
   private static float[][] pheromoneGraph; //Directional trails inxexed as [from][to]
   private static float[][] pointGraph;
   public static void runACO(float[][] graph, int numAnts){
      int numNodes = graph.length;
      pointGraph = graph; 
      pheromoneGraph = new float[numNodes][numNodes];


      Ant[] ants = new Ant[numAnts];
      for(Ant ant: ants){
         int startNode = (int)(Math.random() * numNodes);
         ant = new Ant(startNode, numNodes);
      }




   }

   public static float[][] getGraph(){
      return pointGraph;
   }  
}
