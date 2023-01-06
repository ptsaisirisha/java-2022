package com.xworkz.repository;

import java.util.ArrayList;

import com.xworkz.dto.TelevisionDto;

public class TelevisionRepoImpl implements TelevisionRepo {
	
	ArrayList<TelevisionDto> list=new ArrayList<TelevisionDto>();

	@Override
	public boolean save(TelevisionDto dto) {
		list.add(dto);
		System.out.println("data saved in repo");
		return true;
	}

	@Override
	public ArrayList<TelevisionDto> read() {
	System.out.println("read");
		return null;
	}

	@Override
	public ArrayList<TelevisionDto> findNameBySize(String name, int size) {
		TelevisionDto find=list.get(size);
		find.setBrandname(name);
		list.set(size, find);
		System.out.println("find name by size");
		return null;
	
	}

	@Override
	@Override
	public ArrayList<TelevisionDto> updateSizeByType(int size, int type) {
		TelevisionDto update=list.get(type);
		update.setSize(size);
	 list.set(type, update);
		System.out.println("Updated size by type");
		return null;
	
	}
}


