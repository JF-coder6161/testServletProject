package com.jf.dao;

import com.jf.pojo.Area;

import java.util.List;

public interface AreaDao {

    List<Area> findAreaByParentID(int parentID);

}
