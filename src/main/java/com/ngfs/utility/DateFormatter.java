package com.ngfs.utility;

public enum DateFormatter {
	yyyy_MM_dd("yyyy-MM-dd"),
	dd_MM_YYYY("dd-MM-YYYY"),
	yyyy_MM_dd__HH_mm_ss("yyyy-MM-dd HH:mm:ss"),
	HH_mm_ss_SSS("HH:mm:ss.SSS"),
	HH_mm_ss("HH:mm:ss"),
	yyyy_MM_dd__HH_mm_ss_SS("yyyy-MM-dd HH:mm:ss.SSS"),
	yyyy_MM_dd__HH_mm_ss_SS_Z("yyyy-MM-dd HH:mm:ss.SSS Z"),
	yyyy_MM_ddWithSlash("yyyy/MM/dd"),
	dd_MM_YYYYWithSlash("dd/MM/YYYY"),
	yyyy_MM_dd__HH_mm_ssWithSlash("yyyy/MM/dd HH:mm:ss"),
	yyyy_MM_dd__HH_mm_ss_SSWithSlash("yyyy/MM/dd HH:mm:ss.SSS"),
	yyyy_MM_dd__HH_mm_ss_SS_ZWithSlash("yyyy/MM/dd HH:mm:ss.SSS Z");
	
	private String formatter;

	private DateFormatter(String format) {
		this.formatter = format;
	}

	public String format() {
		return formatter;
	}

}
