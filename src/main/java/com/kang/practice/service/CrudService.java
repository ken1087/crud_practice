package com.kang.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kang.practice.dto.TestDto;
import com.kang.practice.entity.QCrud;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Service
public class CrudService {

    @Autowired
    JPAQueryFactory queryDsl;

    QCrud qCrud = QCrud.crud;

    public void insertCrud(TestDto testDto) {
        queryDsl.insert(qCrud).values(null, testDto.getTitle(), testDto.getContent(), null, null);
    }
    
    public void updateCrud(TestDto testDto) {

    }

}
