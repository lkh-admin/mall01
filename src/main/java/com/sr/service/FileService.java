package com.sr.service;

import com.sr.domain.FileDo;

import java.util.List;

public interface FileService {


        List<FileDo> findByUserId(Integer id);

        void save(FileDo fileDo);

        FileDo findById(String id);

        void update(FileDo fileDo);

        void delete(String id);

}
