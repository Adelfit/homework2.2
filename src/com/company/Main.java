package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	final Random random = new Random();
	int min = 0;
	int max = 107;
	int diff = max - min;
	int i = random.nextInt(diff +1);
	i += min;
        System.out.println(i);
    }
}
