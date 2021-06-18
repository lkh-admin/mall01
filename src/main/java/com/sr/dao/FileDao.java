package com.sr.dao;

import com.sr.domain.FileDo;

import java.util.List;

public interface FileDao {
    //根据登录用户id获取用户的文件列表
    List<FileDo> findByUserId(Integer id);

    //保存用户的文件记录
    void save(FileDo fileDo);

    //根据文件id获取文件信息
    FileDo findById(String id);

    //根据id更新下载次数
    void update(FileDo fileDo);

    //根据id删除记录
    void delete(String id);
}
