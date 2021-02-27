package com.starbugs.model.dao;

import com.starbugs.model.vo.Coffee;

public interface CafeDAO {

	public void saveFile(Coffee[] orderArr);

	public Coffee[] openFile();
	
}
