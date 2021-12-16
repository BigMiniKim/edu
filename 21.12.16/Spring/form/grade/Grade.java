package edu.kosmo.ex.grade;


import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Grade {

	private double kor;
	private double eng;
	private double math;

	public double  total() {
		double total = kor + eng + math;
		return total;
	}
	public double  avg() {
		double avg = total()/3.0;
		return avg;
	}
	public String getGrade() {
		double avg = avg();
		String str;

		if (avg >= 90) {
			str = "수 입니다";

		} else if (avg >= 80) {
			str = "우 입니다";

		} else if (avg >= 70) {
			str = "미 입니다";

		} else if (avg >= 60) {
			str = "양 입니다";

		} else {
			str = "가 입니다";
		}
		return str;
	}
}

