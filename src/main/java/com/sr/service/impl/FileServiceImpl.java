package com.sr.service.impl;

import com.sr.dao.FileDao;
import com.sr.domain.FileDo;
import com.sr.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    private FileDao fileDao;

    @Override
    public List<FileDo> findByUserId(Integer id) {
        return fileDao.findByUserId(id);
    }

    @Override
    public void delete(String id) {
        fileDao.delete(id);
    }

    @Override
    public void update(FileDo userFile) {
        fileDao.update(userFile);
    }

    @Override
    public FileDo findById(String id) {
        return fileDao.findById(id);
    }

    @Override
    public void save(FileDo userFile) {
        //userFile.setIsImg()?  //是否是图片 解决方案: 当类型中含有image时说明当前类型一定为图片类型
        String isImg = userFile.getType().startsWith("image")?"是":"否";
        userFile.setIsImg(isImg);
        userFile.setDowncounts(0);
        userFile.setUploadTime(new Date());
        fileDao.save(userFile);
    }
}
