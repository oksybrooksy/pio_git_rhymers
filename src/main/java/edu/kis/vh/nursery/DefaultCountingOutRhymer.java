package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int TOTAL = -1;

	private final int[] numbers = new int[ARRAY_SIZE];

	private int total = TOTAL;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == -1;
		}
	public boolean isFull() {
				return total == 11;
			}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
