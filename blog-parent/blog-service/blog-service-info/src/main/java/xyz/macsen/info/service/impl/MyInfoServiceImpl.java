package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.pojo.MyInfo;
import xyz.macsen.info.service.MyInfoService;

import java.util.List;

@Service
public class MyInfoServiceImpl implements MyInfoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 获取myInfo
     * @return
     */
    @Override
    public MyInfo findMyInfo() {
        List<MyInfo> myInfo = mongoTemplate.findAll(MyInfo.class, "myInfo");
        if (CollectionUtils.isEmpty(myInfo)) {
            throw new BlogException(ExceptionEnum.MYINFO_NOT_FOUND);
        }
        return myInfo.get(0);
    }
}
