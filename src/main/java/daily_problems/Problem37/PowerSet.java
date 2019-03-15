package daily_problems.Problem37;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    /*
    The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.
     */

    public List<List<Integer>> createPowerSets(List<Integer> set, int index) {
        List<List<Integer>> allsubsets = new ArrayList<>();

        if (set.size() == index) { //base case, we have an empty set
            allsubsets = new ArrayList<>();
            allsubsets.add(new ArrayList<>()); //this adds the empty set case
        } else {
            allsubsets = createPowerSets(set, index + 1); //keep going, incrementing index so we hit our base case
            int item = set.get(index); //get element at current index, this is what we will be adding to each existing subset
            List<List<Integer>> moresubsets = new ArrayList<>(); //this will hold our new subsets
            for (List<Integer> subset : allsubsets) { //iterating through all subsets we have so far
                List<Integer> newSubset = new ArrayList<>(); //this represents the new subset we will generate for the given subset we are on
                newSubset.addAll(subset); //add previous subset to our new one
                newSubset.add(item); //add the element to it
                moresubsets.add(newSubset); //add the new subset (existing + element) to our moresubsets holder
            }
            allsubsets.addAll(moresubsets); //once we've done this for all existing subsets we add moresubsets to all
        }
        return allsubsets; //finally return all
    }
}

/*
(), 1
now if we add 2 => (), (1), () + (2), (1) + (2) => (), (1), (2), (1,2)
clone the existing subsets and add the additional items to each

GO THROUGH:
(set.size == 2, index == 0), not the base case
(set.size == 2, index == 1), not the base case
(set.size == 2, index == 2), base case -> create an empty List in our totalSubsets
hit return allSetsubsets
go back and do remaining work in the else
(set.size == 2, index == 1)
set.get(1) == 2
moreSubsets will be all the subsets associated with 2
iterate through allSubsets which is currently empty
newSubset will be a single subset added to moreSubsets
add the empty list to newSubset
and then add 2 to the empty list
finally, add List(2) to moresubsets
since the subset list was empty we are done and add List(2) to allSubsets
(set.size == 2, index == 0)
set.get(0) == 1
moreSubsets will be all the subsets that include 1
iterate through allSubsets which is currently List(List(), List(2))
newSubset will be a single subset added to moreSubsets
first newSubset is List() + 1 => List(1)
second newSubset is List(2) + 1 => List(1,2)
these are both added to moresubsets
now we are done so add moresubsets to allsubsets
so our final count of allsubsets is List(List(), List(2), List(1), List(1,2))
*/
