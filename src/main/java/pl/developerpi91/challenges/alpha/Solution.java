package pl.developerpi91.challenges.alpha;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/***
 *
 * @author developerpi91
 *
 * task fro codiliti https://app.codility.com/programmers/task/prefix_set/
 *
 * A non-empty array A consisting of N integers is given. The first covering prefix of array A
 * is the smallest integer P such that 0≤P<N and such that every value that occurs in array A
 * also occurs in sequence A[0], A[1], ..., A[P].
 *
 */
public class Solution {

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,1};
        Set<Integer> uniqueValue = new HashSet<>();

        for (int i:A) {
            if(!uniqueValue.contains(i)){
                uniqueValue.add(i);
            }
        }

        System.out.println("Unikalne wartosci:" + uniqueValue.toString() );

        for (int i=0; i<=A.length -1 ; i++ ){
        if(uniqueValue.contains(A[i])){
            uniqueValue.remove(A[i]);
        }
        if (uniqueValue.isEmpty()){
            System.out.println("poprawny index: " + i);
            return;
        }
    }

    }
}
