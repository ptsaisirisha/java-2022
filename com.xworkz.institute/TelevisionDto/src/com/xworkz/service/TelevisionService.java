package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.dto.TelevisionDto;

public interface TelevisionService {
	
	public boolean save(TelevisionDto dto);
	public ArrayList<TelevisionDto> read();
	public ArrayList<TelevisionDto> findNameBySize(String name,int size);	
    public ArrayList<TelevisionDto> updateSizeByType(int size,String type);	

}
