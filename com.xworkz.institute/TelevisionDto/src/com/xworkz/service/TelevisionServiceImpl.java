package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.dto.TelevisionDto;
import com.xworkz.repository.TelevisionRepo;
import com.xworkz.repository.TelevisionRepoImpl;

public class TelevisionServiceImpl implements TelevisionService {
  TelevisionRepo repo=new TelevisionRepoImpl();

@Override
public boolean save(TelevisionDto dto) {
	if(dto!=null) {
		System.out.println("sending to repo");
		return true;
	}
	return false;

}

@Override
public ArrayList<TelevisionDto> read() {
	return repo.read();
}

@Override
public ArrayList<TelevisionDto> findNameBySize(String name, int size) {
	return repo.findNameBySize(name,size);
}

	
	
	
	
	
}
