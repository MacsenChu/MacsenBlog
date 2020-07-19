package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.Music;
import xyz.macsen.info.service.MusicService;

import java.util.List;

@RestController
@RequestMapping("/musics")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public Result<List<Music>> musics() {
        List<Music> musics = musicService.findAllMusics();
        return new Result<List<Music>>(true, StatusCode.OK, "音乐列表获取成功", musics);
    }
}
