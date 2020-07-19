package xyz.macsen.about.service;

import xyz.macsen.about.vo.AboutInfo;

public interface AboutService {

    /**
     * 获取about页面的信息
     * @return
     */
    AboutInfo findAboutInfo();
}
