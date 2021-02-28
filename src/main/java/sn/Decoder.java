package sn;

import java.util.LinkedList;
import java.util.*;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Decoder {

    List<Integer> acceptedNumbers =  IntStream.rangeClosed(1,26).boxed().collect(Collectors.toList());


    public int numDecodings(String inputString) {

        Queue<Integer> q = new LinkedList<>(acceptedNumbers);
        int result = 0;


        while(!q.isEmpty()){
            String intPrefix = q.poll().toString();
            if(inputString.startsWith(intPrefix)){
                System.out.print(intPrefix + " ");
                if(inputString.length() > intPrefix.length()){
                    result += numDecodings(inputString.substring(intPrefix.length())); // numDecodings("2")--> 2 2 6 22222222222222
                } else {
                    System.out.println();
                    result += 1;
                }
            }
        }


        return result;
    }

}
