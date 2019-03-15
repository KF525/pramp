package daily_problems.Problem17;

public class LongestDirectoryPath {
/*
Suppose we represent our file system by a string in the following manner:

The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:

dir
    subdir1
    subdir2
        file.ext
The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.

The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:

dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note:

The name of a file contains at least a period and an extension.

The name of a directory or sub-directory will not contain a period.
 */
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
