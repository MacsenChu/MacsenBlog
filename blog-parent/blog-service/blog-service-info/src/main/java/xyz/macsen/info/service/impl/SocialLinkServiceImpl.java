package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.pojo.SocialLink;
import xyz.macsen.info.service.SocialLinkService;

import java.util.List;

@Service
public class SocialLinkServiceImpl implements SocialLinkService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查询社交平台链接
     * @return
     */
    @Override
    public SocialLink findSocialLink() {
        List<SocialLink> socialLinks = mongoTemplate.findAll(SocialLink.class, "socialLink");
        if (CollectionUtils.isEmpty(socialLinks)) {
            throw new BlogException(ExceptionEnum.SOCIALLINK_NOT_FOUND);
        }
        return socialLinks.get(0);
    }
}
