package com.xworkz.repository;

import java.util.ArrayList;

import com.xworkz.dto.TelevisionDto;

public interface TelevisionRepo {
	
	public boolean save(TelevisionDto dto);
	public ArrayList<TelevisionDto> read();
	public ArrayList<TelevisionDto> findNameBySize(String name,int size);
	 public ArrayList<TelevisionDto> updateSizeByType(int size,String type);
	ArrayList<TelevisionDto> updateSizeByType(int size, int type);	
	

}
