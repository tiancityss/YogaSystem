package com.woniuxy.yogasystem.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.yogasystem.dao.DtoDao;
import com.woniuxy.yogasystem.dto.CoachDto;
import com.woniuxy.yogasystem.dto.VenuesDto;
import com.woniuxy.yogasystem.service.DtoDaoService;
@Service("DtoDaoService")
public class DtoDaoServiceImpl implements DtoDaoService{
	@Autowired
	private DtoDao dtoDao;
	@Override
	public List<CoachDto> findAllCoachDto() {
		// TODO Auto-generated method stub
		return dtoDao.findAllCoachDto();
	}

	@Override
	public List<VenuesDto> findAllVenuesDto() {
		// TODO Auto-generated method stub
		return dtoDao.findAllVenuesDto();
	}

}
