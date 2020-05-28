package com.assignment.calculate;

public class StringCalculatorUtil {

	public Integer addNumbers(String numbers) {

		Integer sum = 0;

		if (numbers.equals(""))
			return sum;
		else if (numbers.length() <= 3) {
			sum = getSumOfNumbers(numbers, sum);
			return sum;
		} else {
			sum = getSumOfNumbers(numbers, sum);
			return sum;
		}
	}

	private Integer getSumOfNumbers(String numbers, Integer sum) {
		for (Integer index = 0; index < numbers.length(); index++) {

			Character character = new Character(numbers.charAt(index));
			String num = character.toString();

			if (!num.equalsIgnoreCase(","))
				sum += Integer.valueOf(num);
		}
		return sum;
	}
}
