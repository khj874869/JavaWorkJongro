package com.KH.day09api.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today =  Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		Exam_Calendar ex = new Exam_Calendar();
		//개강일
		openDate.clear();
		openDate.set(2023, 4,15,9,0);
		//종강일
		closeDate.clear();
		closeDate.set(2023,10,26,17,50);		
		closeDate.set(Calendar.HOUR_OF_DAY,17);
		closeDate.set(Calendar.MINUTE, 50);
		ex.printCalendar("현재",today);
		ex.printCalendar("개강일",openDate);
		ex.printCalendar("종강일",closeDate);
		
		//Cannot make a static reference 
		//to the non-static method printCalendar(String, Calendar) 
		//from the type Exam_Calendar
		
	}
	public void printCalendar(String title, Calendar Cal) {
		int year 	   =	Cal.get(Calendar.YEAR);
		int month 	   =	Cal.get(Calendar.MONTH);
		int day 	   =	Cal.get(Calendar.DAY_OF_MONTH); 
		int dateWeek   = 	Cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay  =	Cal.get(Calendar.HOUR_OF_DAY);
		int ampm 	   = 	Cal.get(Calendar.AM_PM);
		int hour 	   = 	Cal.get(Calendar.HOUR);
		int minute     = 	Cal.get(Calendar.MINUTE);
		int second 	   = 	Cal.get(Calendar.SECOND);
		int millisecond = 	Cal.get(Calendar.MILLISECOND);
		//현재 시간 
		System.out.print(title + " ");
		
		System.out.print(year + "/" + (month)
		+ "/" + day);
		switch(dateWeek) {
		case Calendar.MONDAY : System.out.println("일요일");break;
		case Calendar.WEDNESDAY : System.out.println("월요일");break;
		case Calendar.TUESDAY : System.out.println("화요일");break;
		case Calendar.THURSDAY : System.out.println("수요일");break;
		case Calendar.FRIDAY : System.out.println("목요일");break;
		case Calendar.SATURDAY : System.out.println("금요일");break;
		case Calendar.SUNDAY : System.out.println("토요일");break;
		}
		System.out.print("("+hourOfDay+")");
		System.out.print(hour + "시");
		if(ampm == Calendar.AM)  System.out.print("오전");
		else System.out.print("오후");
		System.out.print(minute+"분");
		System.out.print(second+"초");
		System.out.print(millisecond+"밀리초");
		System.out.println();
	}
}
