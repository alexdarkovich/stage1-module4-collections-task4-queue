package com.epam.collections.queue;

import javax.swing.*;
import java.util.*;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("Java", "PriorityQueue", "class");
        List<String> secondList = Arrays.asList("It", "is", "different", "from", "standard", "queues", "where", "FIFO");
        List<String> third = new ArrayList<>(firstList);
                third.addAll(secondList);
        Collections.sort(third);
        Collections.reverse(third);
        System.out.println(third);

        Queue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(third);
        System.out.println(priorityQueue);
    }

    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> third = new ArrayList<>(firstList);
        third.addAll(secondList);
        Collections.sort(third);
        Collections.reverse(third);

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(third);
        return priorityQueue;
    }
}
