package com.jd.service;

import com.jd.domain.LearnResouce;
import com.jd.tools.Page;

import java.util.Map;

/**
 * @author wanlong
 * @since 2018/1/3
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    Page queryLearnResouceList(Map<String,Object> params);
}
