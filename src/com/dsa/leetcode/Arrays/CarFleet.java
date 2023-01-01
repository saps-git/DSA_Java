package com.dsa.leetcode.Arrays;

//Leetcode-853

import java.util.Arrays;

public class CarFleet {
    private static class Car {
        int position;
        double time;
        Car(int position, double time) {
            this.position = position;
            this.time = time;
        }
    }
    public static int carFleet(int target, int[] position, int[] speed) {
        Car[] car = new Car[position.length];
        for(int i=0;i<position.length;i++) {
            double time = (double)(target - position[i])/speed[i];
            car[i] = new Car(position[i], time);
        }

        Arrays.sort(car, (a, b) -> b.position - a.position);

        int numFleets = 1;
        int firstCar = 0;
        for(int i=1;i<car.length;i++) {
            if(car[i].time > car[firstCar].time) {
                numFleets += 1;
                firstCar = i;
            }
        }

        return numFleets;
    }
    public static void main(String[] args) {
        int target = 10;
        //int[] position = {10,8,0,5,3}, speed = {2,4,1,1,3};
        int[] position = {0,4,2}, speed = {2,1,3};
        System.out.println(carFleet(target, position, speed));
    }
}
