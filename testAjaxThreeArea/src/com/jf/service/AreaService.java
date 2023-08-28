package com.jf.service;

import com.jf.pojo.Area;

import java.util.List;

public interface AreaService {

    List<Area> findAreaByParentID(Integer parentID);
}
