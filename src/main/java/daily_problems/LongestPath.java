package daily_problems;

public class LongestPath {

    public int getLongestPath(String path) {
       Node dir = new Node("dir");
       Node[] children = pathToTree(path.substring(3), "\\n\\t");
       dir.children = children;
       return getLongestPathOfTree(dir);
    }

    public int getLongestPathOfTree(Node root) {
        int longestPathResult = 0;

        if (root == null) {
            return 0;
        } else if (root.children.length == 0) {
            if (root.name.contains(".")) {
                return root.name.length();
            } else {
                return 0;
            }
        } else {
            for (Node child: root.children) {
                int longestPath = 1 + getLongestPathOfTree(child);
                if (longestPathResult < longestPath) {
                    longestPathResult = longestPath;
                }
            }
        }

        if (longestPathResult == 0) {
            return 0;
        } else {
            return root.name.length() + longestPathResult;
        }
    }

    public Node[] pathToTree(String path, String level) { //  \\n\\t(?!\\t)
        String[] subtrees = path.split(level + "(?!\\t)"); // {subdir1 , subdir2\n\t\tfile.ext}
        Node[] results = new Node[subtrees.length - 1];
        for (int i=1; i < subtrees.length; i++) { //first item in array is always empty string
            Node node;
            if (subtrees[i].contains("\n")) {
                int indexOfRemaining = subtrees[i].indexOf("\n");
                String currentDir = subtrees[i].substring(0, indexOfRemaining);
                String remainingDirs = subtrees[i].substring(indexOfRemaining);
                node = new Node(currentDir, pathToTree(remainingDirs, level + "\\t"));
            } else {
                node = new Node(subtrees[i]);
            }
            results[i - 1] = node;
        }
        return results;
    }

    public class Node {
        String name;
        Node[] children;

        public Node(String name, Node[] children) {
            this.name = name;
            this.children = children;
        }

        public Node(String name) {
            this(name, new Node[]{});
        }
    }
}
