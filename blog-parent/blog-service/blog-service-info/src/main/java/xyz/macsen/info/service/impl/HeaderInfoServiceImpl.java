package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.pojo.HeaderInfo;
import xyz.macsen.info.service.HeaderInfoService;

import java.util.List;

@Service
public class HeaderInfoServiceImpl implements HeaderInfoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 获取博客header配置信息
     * @return
     */
    @Override
    public HeaderInfo findHeaderInfo() {
        List<HeaderInfo> headerInfo = mongoTemplate.findAll(HeaderInfo.class, "headerInfo");
        if (CollectionUtils.isEmpty(headerInfo)) {
            throw new BlogException(ExceptionEnum.HEADERINFO_NOT_FOUND);
        }
        return headerInfo.get(0);
    }
}
