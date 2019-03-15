package daily_problems.Problem78;

import java.util.LinkedList;
import java.util.List;

public class MergeSingleLinkedLists {

    /*
    Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.
    */

    public Node mergeLists(List<Node> lists) {
       Node result = null;




       return result;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}


/*
1->3->8
2->6
4->5->7->10
(1,2,4) =>


create a new list to return
choose the largest to be the one that others merge into
look at the current element of each list
if all the current elements are larger than merge list - go to next for merge list
if that is not the case, find the smallest element and add that to merge list and go to the next element in that list
keep doing this until once none of the other elements are smaller
then move to next item in merge list
if the next in the merge list is null but there are elements in other list, add on to merge list until all other lists are null
once all other lists are null, return the head node of the merge list

test cases
equal lists
different length lists
merge list starts with smallest, merge list does not
merge list ends with largest, merge list does not
duplicate values in the other lists
merge list and empty list
*/