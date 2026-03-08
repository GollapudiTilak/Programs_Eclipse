package com.LabTask;

public class Average {

	String studentName;
	String branch;
	int englishMarks;
	int socialMarks;
	int scienceMarks;

	public Average(String studentName, String branch, int englishMarks, int socialMarks, int scienceMarks) {
		this.studentName = studentName;
		this.branch = branch;
		this.englishMarks = englishMarks;
		this.socialMarks = socialMarks;
		this.scienceMarks = scienceMarks;
	}

	public static void main(String[] args) {
		System.out.println("Student Details");
		System.out.println();
		Average a = new Average("Tilak", "CSE", 85, 76, 70);
		a.display();
		Average a1 = new Average("Nava Bharath", "CSE", 90, 86, 80);
		a1.display();
		Average a2 = new Average("Raj Kumar", "CSE", 75, 70, 80);
		a2.display();
		Average a3 = new Average("Shashank Sai", "CSE", 80, 76, 70);
		a3.display();
	}

	void display() {
		int total = englishMarks + socialMarks + scienceMarks;

		double average = total / 3.0;

		System.out.println("Student Name  : " + studentName);
		System.out.println("Branch        : " + branch);
		System.out.println("English Marks : " + englishMarks);
		System.out.println("Social Marks  : " + socialMarks);
		System.out.println("Science Marks : " + scienceMarks);
		System.out.println("Total Marks   : " + total);
		System.out.println("Average Marks : " + average);
		System.out.println("***********************************");
	}

}
