package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.mapper.MusicMapper;
import xyz.macsen.info.pojo.Music;
import xyz.macsen.info.service.MusicService;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicMapper musicMapper;

    /**
     * 获取音乐列表
     * @return
     */
    @Override
    public List<Music> findAllMusics() {
        List<Music> musics = musicMapper.selectAll();
        if (CollectionUtils.isEmpty(musics)) {
            throw new BlogException(ExceptionEnum.MUSIC_NOT_FOUND);
        }
        return musics;
    }
}
