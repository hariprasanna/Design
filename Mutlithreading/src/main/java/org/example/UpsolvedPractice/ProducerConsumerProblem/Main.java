package org.example.UpsolvedPractice.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        ProducerConsumerProblem p = new ProducerConsumerProblem(3);
        Thread producerthread = new Thread(() -> {
            for(int i = 0 ; i <= 6 ; i++) {
                try {
                    p.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for(int i = 0 ; i <= 6 ; i++) {
                try {
                    p.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerthread.start();
        consumerThread.start();
    }
}
