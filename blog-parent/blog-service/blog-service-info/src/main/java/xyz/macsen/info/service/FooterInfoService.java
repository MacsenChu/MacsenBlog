package xyz.macsen.info.service;

import xyz.macsen.info.pojo.FooterInfo;

public interface FooterInfoService {

    /**
     * 获取博客footer配置信息
     * @return
     */
    FooterInfo findFooterInfo();
}
