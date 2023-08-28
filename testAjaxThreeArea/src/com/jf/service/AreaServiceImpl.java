package com.jf.service;

import com.jf.dao.AreaDao;
import com.jf.dao.AreaDaoImpl;
import com.jf.pojo.Area;

import java.util.List;

public class AreaServiceImpl implements AreaService {

    private AreaDao areaDao = new AreaDaoImpl();
    @Override
    public List<Area> findAreaByParentID(Integer parentID) {
        return areaDao.findAreaByParentID(parentID);
    }
}
