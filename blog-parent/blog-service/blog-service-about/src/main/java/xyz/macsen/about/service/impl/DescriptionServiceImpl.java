package xyz.macsen.about.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.about.pojo.Description;
import xyz.macsen.about.service.DescriptionService;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;

import java.util.List;

@Service
public class DescriptionServiceImpl implements DescriptionService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查询about页面description
     * @return
     */
    @Override
    public Description findDescription() {
        List<Description> descriotion = mongoTemplate.findAll(Description.class, "desc");
        if (CollectionUtils.isEmpty(descriotion)) {
            throw new BlogException(ExceptionEnum.DESCRIPTIONN_NOT_FOUND);
        }
        return descriotion.get(0);
    }
}
