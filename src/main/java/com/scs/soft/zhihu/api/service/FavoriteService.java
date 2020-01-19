package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
public interface FavoriteService {
    /**
     * 查询所有收藏
     *
     * @return List<Map>
     */
    List<Map> selectAllFavorite();

    /**
     * 查询被关注最多收藏
     *
     * @return List<Favorite>
     */
    List<Favorite> selectMost();
}
