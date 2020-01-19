package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Column;
import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
public interface ColumnService {
    /**
     * 查询所有专栏
     *
     * @return List<Map>
     */
    List<Map> selectAllColumn();

    /**
     * 查询被关注最多专栏
     *
     * @return List<Column>
     */
    List<Column> selectHot();
}
