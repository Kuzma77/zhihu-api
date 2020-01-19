package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Column;
import com.scs.soft.zhihu.api.mapper.ColumnMapper;
import com.scs.soft.zhihu.api.service.ColumnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
@Service
public class ColumnServiceImpl implements ColumnService {
    @Resource
    private ColumnMapper columnMapper;
    @Override
    public List<Map> selectAllColumn() {
        return columnMapper.selectAllColumn();
    }

    @Override
    public List<Column> selectHot() {
        return columnMapper.selectHot();
    }
}
