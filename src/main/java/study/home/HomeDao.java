package study.home;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import study.home.mapper.HomeMapper;
import study.home.vo.TestVO;

@Repository
// @MapperScan("study.home.mapper")
public class HomeDao implements HomeMapper{

    @Lazy
    @Autowired
    HomeMapper mapper;
    
    public TestVO getTest(){
        return mapper.getTest();
        // return new TestVO();
    }
}
