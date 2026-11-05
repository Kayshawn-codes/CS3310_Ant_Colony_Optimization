public class Testing {
   //Dimensions for UI so graph can map to valid pixel values
   static int UIX = 255;
   static int UIY = 255;
   static int UIXPAD = 20; //Padding to make space for node graphics on edges
   static int UIYPAD = 20;

   public static float[][] generateGraph(int numNodes){
      float[][] graph = new float[numNodes][2];
      for(int nodeIndex = 0; nodeIndex < numNodes; nodeIndex++){
         graph[nodeIndex][0] = (float)Math.random() * (UIX - UIXPAD) + UIXPAD;
         graph[nodeIndex][1] = (float)Math.random() * (UIY - UIYPAD) + UIYPAD;
      }
      return graph;
   }

   public static void main(String[] args) {
      float[][] graph = generateGraph(20);
      for(int x = 0; x < graph.length; x++){
         System.out.printf("Node %d: (%f, %f)\n", x, graph[x][0], graph[x][1]);
      }
   }
}
