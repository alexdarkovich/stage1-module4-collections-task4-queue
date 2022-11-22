package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {

    public static void main(String[] args) {
        int numberOfDishes = 11;
        int everyDishNumberToEat = 4;

        Queue<Integer> queue = new ArrayDeque<>();
        int count = 1;
        while (count <= numberOfDishes) {
            queue.add(count);
            count++;
        }

        List<Integer> listPrint = new ArrayList<>();
        Queue<Integer> toStore = new ArrayDeque<>();

        while (listPrint.size() < numberOfDishes) {
            if (queue.size() < everyDishNumberToEat) {
                while (toStore.size() != 0) {
                    queue.add(toStore.poll());
                }
            }
            if (queue.size() < everyDishNumberToEat) {
                while (!queue.isEmpty()) {
                    listPrint.add(queue.poll());
                }
                break;
            }
            int count2 = 1;
            while (count2 < everyDishNumberToEat) {
                toStore.add(queue.poll());
                count2++;
            }
            listPrint.add(queue.poll());
        }
        System.out.println(listPrint);
    }


    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Queue<Integer> queue = new ArrayDeque<>();
        int count = 1;
        while (count <= numberOfDishes) {
            queue.add(count);
            count++;
        }

        List<Integer> listPrint = new ArrayList<>();
        Queue<Integer> toStore = new ArrayDeque<>();

        while (listPrint.size() < numberOfDishes) {
            if (queue.size() < everyDishNumberToEat) {
                while (toStore.size() != 0) {
                    queue.add(toStore.poll());
                }
            }
            if (queue.size() < everyDishNumberToEat) {
                listPrint.add(queue.poll());
                toStore.add(queue.poll());
                listPrint.add(queue.poll());
                listPrint.add(toStore.poll());
                break;
            }
            int count2 = 1;
            while (count2 < everyDishNumberToEat) {
                toStore.add(queue.poll());
                count2++;
            }
            listPrint.add(queue.poll());
        }
        return listPrint;
    }
}
