package com.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ArrayForkJoin {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int thread = Runtime.getRuntime().availableProcessors();
		System.out.println(thread);

		int[] numbers = new int[5000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}

		ForkJoinPool forkJoinPool = new ForkJoinPool(thread);
		Long result = forkJoinPool.invoke(new Sum(numbers, 0, numbers.length));
		System.out.println(result);
	}

	static class Sum extends RecursiveTask<Long> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		int low;
		int high;
		int[] array;

		Sum(int[] array, int low, int high) {
			this.array = array;
			this.low = low;
			this.high = high;
		}

		public Long compute() {

			if (high - low <= 10) {
				long sum = 0;
				for (int i = low; i < high; ++i)
					sum += array[i];
				return sum;
			} else {
				int mid = low + (high - low) / 2;
				Sum left = new Sum(array, low, mid);
				Sum right = new Sum(array, mid, high);
				left.fork();
				long rightResult = right.compute();
				long leftResult = left.join();
				return leftResult + rightResult;
			}
		}
	}
}
