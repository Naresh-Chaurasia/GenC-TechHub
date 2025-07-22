package com.springsorting2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GenCApplication1 {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(GenCApplication1.class, args);
		SortService sortService = context.getBean(SortService.class);

		int[] sortedNumbers = sortService.sortNumbers(new int[] { 5, 3, 8, 1, 2 });
		System.out.println("Sorted numbers: ");
		for (int number : sortedNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();

	}

}
