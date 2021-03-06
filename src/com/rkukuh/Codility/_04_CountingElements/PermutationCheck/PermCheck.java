package com.rkukuh.Codility._04_CountingElements.PermutationCheck;

import java.util.Arrays;

public class PermCheck
{
    public int solution(int[] A)
    {
        Arrays.sort(A);

        if (A[0] != 1) {

            return 0;
        }

        boolean isSequence = true;

        for (int i = 0; i < A.length - 1; i++) {

            int currentPosition = A[i];
            int nextPosition = A[i + 1];

            if (nextPosition - currentPosition != 1) {

                isSequence = false;
                break;
            }
        }

        if (isSequence) {

            return 1;
        }

        return 0;
    }
}
