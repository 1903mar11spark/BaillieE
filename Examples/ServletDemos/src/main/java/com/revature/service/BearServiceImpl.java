package com.revature.service;


import java.util.List;

import com.revature.beans.Bear;
import com.revature.dao.BearDAO;
import com.revature.dao.BearDAOImp;

public class BearServiceImpl implements BearService {

	private BearDAO bd = new BearDAOImp();
	@Override
	public List<Bear> allBears() {
		return bd.getBears();
	}

	@Override
	public Bear getBearById(int id) {
		return bd.getBearById(id);
	}

	@Override
	public boolean createBear(Bear bear) {
		return bd.createBear(bear);
	}
}
