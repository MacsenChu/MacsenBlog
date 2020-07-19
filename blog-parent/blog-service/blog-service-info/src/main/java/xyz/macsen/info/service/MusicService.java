package xyz.macsen.info.service;

import xyz.macsen.info.pojo.Music;

import java.util.List;

public interface MusicService {

    /**
     * 获取音乐列表
     * @return
     */
    List<Music> findAllMusics();
}
