package sessions;

import java.util.ArrayList;
import java.util.List;

public class SalesPath {
    /*
    sales path is sum of root to leaf, getCheapestCost returns cost of path that has smallest sum
    */

    public int getCheapestCost(TNode root) {
        int cheapestCost = Integer.MAX_VALUE;
        //what about an empty tree
        //base case
        if (root.children.size() == 0) { //if there are no children - return node cost
            return root.cost;
        } else {
            //go through each child and calculate path cost
            //any paths that are less than cheapest cost should replace that value
            for (TNode child: root.children) {
                int pathCost = root.cost + getCheapestCost(child);
                if (pathCost < cheapestCost) {
                    cheapestCost = pathCost;
                }
            }
        }
        //this root represents is the top value of the tree
        return  cheapestCost;
    }

    int getCheapestCost2(TNode rootNode) {
        int min = Integer.MAX_VALUE;

        if (rootNode.children.size() == 0) return rootNode.cost;  //base case node has no children => return its cost
        for (TNode child: rootNode.children) {
            int pathCost = getCheapestCost2(child); //otherwise keep going
            if (pathCost < min) {
                min = pathCost;
            } else {
                min = min;
            }
        }
        return rootNode.cost + min;
    }

    public static class TNode {
        int cost;
        List<TNode> children;

        public void setChildren(List<TNode> children) {
            this.children = children;
        }

        public TNode(int cost) {
            this.cost = cost;
            this.children = new ArrayList<>();
        }
    }
}
