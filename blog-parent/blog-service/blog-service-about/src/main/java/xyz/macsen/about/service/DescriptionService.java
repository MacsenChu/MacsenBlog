package xyz.macsen.about.service;

import xyz.macsen.about.pojo.Description;

public interface DescriptionService {

    /**
     * 查询about页面description
     * @return
     */
    Description findDescription();
}
