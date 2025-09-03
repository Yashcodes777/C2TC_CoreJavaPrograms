package com.tnsif.daySixteen;

import java.util.ArrayList;

public class ArrayListThreadExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Thread producerThread = new Thread(new NumberProducer(numbers));
        Thread consumerThread = new Thread(new NumberConsumer(numbers));
        producerThread.start();
        consumerThread.start();
    }

    static class NumberProducer implements Runnable {
        private final ArrayList<Integer> numbers;

        public NumberProducer(ArrayList<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    numbers.add(i);
                    System.out.println("Produced: " + i);
                }
           }
        }
    }

    class NumberConsumer implements Runnable {
        private final ArrayList<Integer> numbers;

        public NumberConsumer(ArrayList<Integer> numbers2) {
            this.numbers = numbers2;
        }

        @Override
        public void run() {
            while (true) {
                    if (!numbers.isEmpty()) {
                        int number = numbers.remove(0);
                        System.out.println("Consumed: " + number);
                    }
                //}
            }
        }
    }