package com.ngfs.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class General implements IGeneral{

	public Long getLongValueOfDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		   long milliseconds=0;
		try {
			date = sdf.parse(sdf.format(date));
		    milliseconds = date.getTime();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return milliseconds;
	}

	public Long getLongValueOfDate(Date date, DateFormatter format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format.toString());
		   long milliseconds=0;
		try {
			date = sdf.parse(sdf.format(date));
		    milliseconds = date.getTime();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return milliseconds;
	}

	public Date getDateFromLong(Long date) {
		return new Date(date);
	}


	public Long getLongValueOfDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		   long milliseconds=0;
		try {
			Date date = sdf.parse(sdf.format(new Date()));
		    milliseconds = date.getTime();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return milliseconds;
	}

	public Long getLongValueOfDate(DateFormatter format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format.toString());
		   long milliseconds=0;
		try {
			Date date = sdf.parse(sdf.format(new Date()));
		    milliseconds = date.getTime();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return milliseconds;
	}

	public Date getDate() {
		return new Date();
	}

	public String getDateStringFromLong(Long date, DateFormatter format) {
		String dateString=null;
		SimpleDateFormat sdf = new SimpleDateFormat(format.format());
		try {
			dateString = sdf.format(date);
		} catch (Exception e) {
		    e.printStackTrace();
		}	
		return dateString;
	}

	public String getDateString(DateFormatter format) {
		String dateString=null;
		SimpleDateFormat sdf = new SimpleDateFormat(format.format());
		try {
			dateString = sdf.format(new Date());
		} catch (Exception e) {
		    e.printStackTrace();
		}	
		return dateString;
	}

	@Override
	public int getDayDifference(Date date) {
			int count=0;
			try {
				long diff =new Date().getTime() - date.getTime();
				 count = (int) TimeUnit.MILLISECONDS.toDays(diff); 
			}catch(Exception e) {
				
			}
			return count;	
	}

	
	
}
