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
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private String viewCount;
    private String followersCount;
    private String updated;
}
