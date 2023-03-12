import java.util.*;
public class GraphUsingAdjacencyMatrix {
    
    static class graphNode
    {
        public String name;
        public int index;
        boolean isVisited = false;
        public graphNode parent;

        public graphNode(String name, int index)
        {
            this.name = name;
            this.index = index;
            
        }
    }

    static class graph{
        static ArrayList<graphNode> nodeList = new ArrayList<graphNode>();
       static  int[][] adjacencyMatrix;

        public graph(ArrayList<graphNode> nodeList)
        {
            this.nodeList = nodeList;
            adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
        }

        public static void addUndirected(int i,int j)
        {
            adjacencyMatrix[i][j] = 1;
            adjacencyMatrix[j][i] = 1;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("   ");
            for (int i = 0; i < nodeList.size(); i++) {
              s.append(nodeList.get(i).name + " ");
            }
            s.append("\n");
            for (int i = 0; i < nodeList.size(); i++) {
              s.append(nodeList.get(i).name + ": ");
              for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
              }
              s.append("\n");
            }
            return s.toString();
          }

          //get neighbours
          public static ArrayList<graphNode> getNeighbors(graphNode node) {
            ArrayList<graphNode> neighbors = new ArrayList<graphNode>();
            int nodeIndex = node.index;
            for (int i=0; i<adjacencyMatrix.length; i++) {
              if(adjacencyMatrix[nodeIndex][i]==1) {
                neighbors.add(nodeList.get(i));
              }
            }
            return neighbors;
        
          }

          //bfs internal

          void bfsVisit(graphNode node) {
           java.util.LinkedList<graphNode> queue = new java.util.LinkedList<graphNode>();
            queue.add(node);
            while(!queue.isEmpty()) {
              graphNode currentNode = queue.remove(0);
              currentNode.isVisited = true;
              System.out.print(currentNode.name + " ");
              ArrayList<graphNode> neighbors = getNeighbors(currentNode);
              for (graphNode neighbor: neighbors) {
                if (!neighbor.isVisited) {
                  queue.add(neighbor);
                  neighbor.isVisited = true;
                }
              }
            }
          }
        
          public void bfs() {
            for (graphNode node : nodeList) {
              if(!node.isVisited) {
                bfsVisit(node);
              }
            }
          }
        
          void dfsVisit(graphNode node) {
            Stack<graphNode> stack = new Stack<>();
            stack.push(node);
            while(!stack.isEmpty()) {
              graphNode currentNode = stack.pop();
              currentNode.isVisited = true;
              System.out.print(currentNode.name + " ");
              ArrayList<graphNode> neighbors = getNeighbors(currentNode);
              for (graphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                  stack.push(neighbor);
                  neighbor.isVisited = true;
                }
              }
        
            }
          }
        
          void dfs() {
            for (graphNode node : nodeList) {
              if(!node.isVisited) {
                dfsVisit(node);
              }
            }
          }
        


          //topological sort

          public void addDirectedEdge(int i, int j) {
            adjacencyMatrix[i][j] = 1;
          }
        
          void topologicalVisit(graphNode node, Stack<graphNode> stack) {
            ArrayList<graphNode> neighbors = getNeighbors(node);
            for (graphNode neighbor : neighbors) {
              if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
              }
            }
            node.isVisited = true;
            stack.push(node);
          }
        
          void topologicalSort() {
            Stack<graphNode> stack = new Stack<>();
            for (graphNode node : nodeList) {
              if (!node.isVisited) {
                topologicalVisit(node, stack);
              }
            }
        
            while (!stack.isEmpty()) {
              System.out.print(stack.pop().name + " ");
            }
          }

          //Single sourcre shortest path

          public static void printPath(graphNode node)
          {
            if(node.parent != null)
            {
              printPath(node.parent);
            }
            System.out.print(node.name+" ");
          }

          public static void BFSforSSSP(graphNode node)
          {
            java.util.LinkedList<graphNode> queue = new java.util.LinkedList<>();
            queue.add(node);
            while(!queue.isEmpty())
            {
              graphNode current = queue.remove(0);
              current.isVisited = true;
              System.out.println("Printing thr path for "+current.name+" : ");
              printPath(current);
              System.out.println();
              ArrayList<graphNode> neighbors = getNeighbors(current);
              for(graphNode neighbor: neighbors)
              {
                if(!neighbor.isVisited)
                {
                  queue.add(neighbor);
                  neighbor.isVisited = true;
                  neighbor.parent = current;
                }
              }
            }
          }


    }

    public static void main(String[] args)
    {
      ArrayList<graphNode> nodeList = new ArrayList<graphNode>();
        nodeList.add(new graphNode("A", 0));
        nodeList.add(new graphNode("B", 1));
        nodeList.add(new graphNode("C", 2));
        nodeList.add(new graphNode("D", 3));
        nodeList.add(new graphNode("E", 4));
        nodeList.add(new graphNode("F", 5));
        nodeList.add(new graphNode("G", 6));

       graph g = new graph(nodeList);
        g.addDirectedEdge(0, 1);
        g.addDirectedEdge(0, 2);
        g.addDirectedEdge(1, 3);
        g.addDirectedEdge(1, 6);
        g.addDirectedEdge(2, 3);
        g.addDirectedEdge(2, 4);
        g.addDirectedEdge(3, 5);
        g.addDirectedEdge(4, 5);
        g.addDirectedEdge(5, 6);
        g.BFSforSSSP(nodeList.get(0));
    }
}
