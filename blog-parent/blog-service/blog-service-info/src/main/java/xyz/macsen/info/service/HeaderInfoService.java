package xyz.macsen.info.service;

import xyz.macsen.info.pojo.HeaderInfo;

public interface HeaderInfoService {

    /**
     * 获取博客header配置信息
     * @return
     */
    HeaderInfo findHeaderInfo();
}
