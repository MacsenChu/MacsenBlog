package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.pojo.FooterInfo;
import xyz.macsen.info.service.FooterInfoService;

import java.util.List;

@Service
public class FooterInfoServiceImpl implements FooterInfoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 获取博客footer配置信息
     * @return
     */
    @Override
    public FooterInfo findFooterInfo() {
        List<FooterInfo> footerInfo = mongoTemplate.findAll(FooterInfo.class, "footerInfo");
        if (CollectionUtils.isEmpty(footerInfo)) {
            throw new BlogException(ExceptionEnum.FOOTERINFO_NOT_FOUND);
        }
        return footerInfo.get(0);
    }
}
