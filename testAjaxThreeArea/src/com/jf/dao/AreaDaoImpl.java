package com.jf.dao;

import com.jf.pojo.Area;

import java.util.List;

public class AreaDaoImpl extends BaseDao implements AreaDao {

    @Override
    public List<Area> findAreaByParentID(int parentID) {
        String sql = "select * from area where parentid = ?";
        return baseQuery(Area.class, sql, parentID);
    }
}
