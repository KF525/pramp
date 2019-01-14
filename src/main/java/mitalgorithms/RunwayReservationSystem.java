package mitalgorithms;


public class RunwayReservationSystem {
    public boolean isScheduled(RunwayNode node, int runwayTime, int k) {
        if (Math.abs(node.val - runwayTime)< k) {
            return false;
        } else if (node.val < runwayTime) {
            if (node.right == null) {
                node.right = new RunwayNode(runwayTime);
                return true;
            }
            return isScheduled(node.right, runwayTime, k);
        } else {
            if (node.left == null) {
                node.left = new RunwayNode(runwayTime);
                return true;
            }
            return isScheduled(node.left, runwayTime, k);
        }
    }

    public static class RunwayNode {
        int val;
        RunwayNode left;
        RunwayNode right;

        public RunwayNode(int val, RunwayNode left, RunwayNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public RunwayNode(int val) {
            new RunwayNode(val, null, null);

        }
    }
}