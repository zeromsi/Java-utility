package com.ngfs.utility;

import java.util.Date;

/**
 * Interface: IGeneral
 * <p>Responsibilities:Basic conversions.</p>            
 */
public interface IGeneral {
	/**
	 * Method: getLongValueOfDate                          
	 * <p>
	 * Parameters:[Date date] 
	 * </p>
	 * <p>
	 * Responsibility:Converts Date value to Long
	 * </p>
	 */
	public Long getLongValueOfDate(Date date);
	/**
	 * Method: getLongValueOfDate                          
	 * <p>
	 * Parameters:[Date date,DateFormatter format] 
	 * </p>
	 * <p>
	 * Responsibility:Converts formated Date value to Long
	 * </p>
	 */
	public Long getLongValueOfDate(Date date,DateFormatter format);
	
	/**
	 * Method: getDateFromLong                          
	 * <p>
	 * Parameters:[Long date] 
	 * </p>
	 * <p>
	 * Responsibility:Converts Date value to Long
	 * </p>
	 */
	public Date getDateFromLong(Long date);
	
	/**
	 * Method: getDateStringFromLong                          
	 * <p>
	 * Parameters:[Long date,DateFormatter format] 
	 * </p>
	 * <p>
	 * Responsibility:Converts Long formatted date to date String
	 * </p>
	 */
	public String getDateStringFromLong(Long date,DateFormatter format);
	
	/**
	 * Method: getLongValueOfDate                          
	 * <p>
	 * Parameters:[] 
	 * </p>
	 * <p>
	 * Responsibility:Converts current date into long and returns
	 * </p>
	 */
	public Long getLongValueOfDate();
	
	/**
	 * Method: getLongValueOfDate                          
	 * <p>
	 * Parameters:[DateFormatter format] 
	 * </p>
	 * <p>
	 * Responsibility:Converts current formatted date into long and returns
	 * </p>
	 */
	public Long getLongValueOfDate(DateFormatter format);
	
	/**
	 * Method: getDate                          
	 * <p>
	 * Parameters:[] 
	 * </p>
	 * <p>
	 * Responsibility:Returns current date
	 * </p>
	 */
	public Date getDate();
	
	/**
	 * Method: getDateString                          
	 * <p>
	 * Parameters:[DateFormatter format] 
	 * </p>
	 * <p>
	 * Responsibility:Converts current formatted date into date String and returns
	 * </p>
	 */
	public String getDateString(DateFormatter format);
	
	/**
	 * Method: getDayDifference                          
	 * <p>
	 * Parameters:[Date date] 
	 * </p>
	 * <p>
	 * Responsibility:returns days difference between current date and passed date
	 * </p>
	 */	
	public int getDayDifference(Date date);
	
	
	
}
