package Inheritance;

import java.util.Arrays;

public class Class {
	
	private int numStudents;
	private Student[] students;
	private Human teacher;
	private double skill=0;
	
	public Class(Student[] students, Human teacher) {
		this.students=students;
		this.teacher=teacher;
		this.numStudents=students.length;
	}
	
	public Class(int n, Human teacher) {
		this.numStudents=n;
		this.teacher=teacher;
		this.students=new Student[n];
	}
	
	public int getNumStudents() {
		return numStudents;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public Human getTeacher() {
		return teacher;
	}
	
	public double getSkill() {
		return skill;
	}
	
	public void addStudent(Student student) {
		Student[] temp=students;
		students=new Student[temp.length+1];
		for (int i=0; i<temp.length; i++) {
			if (temp[i]==null) {
				students=new Student[temp.length];
				for (int j=0; j<temp.length; j++) {
					if (j!=i)
					students[j]=temp[j];
				}
				students[i]=student;
				return;
			}
			students[i]=temp[i];
		}
		students[temp.length]=student;
		numStudents++;
	}
	
	public void removeStudent(String name) {
		Student[] temp=students;
		students=new Student[temp.length-1];
		for (int i=0, j=0; i<temp.length; i++, j++) {
			if (temp[i]==null) continue;
			if (temp[i].getName().equals(name)) {
				j--;
				continue;
			}
			students[j]=temp[i];
		}
		numStudents--;
	}
	
	public void teach(int minutes) {
		skill+=(double)minutes/5;
	}
	
	public String toString() {
		return "Teacher - "+teacher+"\nStudents - "+Arrays.toString(students);
	}
	
//	public static void main (String[] args) {
//		Class a=new Class(5, new Human(5, 10, "Friedman"));
//		System.out.println(a);
//	}
	
}
