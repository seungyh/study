package study.home.mapper;

import org.apache.ibatis.annotations.Mapper;

import study.home.vo.TestVO;

@Mapper
public interface HomeMapper {
    
    public TestVO getTest();
}
