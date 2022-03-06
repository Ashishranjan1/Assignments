package validation;

import exception.InvalidDayException;
import exception.InvalidMonthException;
import exception.InvalidYearException;

public class ValidateDate {
	private int day, month, year;
	static public ValidateDate tester = new ValidateDate();

	private ValidateDate() {
	}

	private boolean isLeap() {
		checkYear();
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	private boolean checkMonth(int m) {
		if (month <= 0 || month > 12) {
			throw new InvalidMonthException();
		}
		return true;
	}

	private boolean checkYear() {
		if (year <= 0) {
			throw new InvalidYearException();
		}
		return true;
	}

	public int noOfDaysInMonth(int d, int m, int y) {

		checkMonth(m);

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			return 31;

		if (m == 2) {
			return isLeap() ? 29 : 28;

		}
		return 30;
	}

	private boolean checkDay() {
		int numOfDays = noOfDaysInMonth(day, month, year);
		if (day <= 0 || day > numOfDays) {
			throw new InvalidDayException();
		}
		return true;
	}

	private boolean checkDate() {
		return checkDay() && checkYear();
	}

	public boolean checkDate(int d, int m, int y) {
		this.day = d;
		this.year = y;
		this.month = m;
		return checkDate();

	}
}
