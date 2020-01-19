package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
@Data
@Builder
public class Column {
    private String columnId;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
