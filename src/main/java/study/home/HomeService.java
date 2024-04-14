package study.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import study.home.vo.TestVO;

@Service
public class HomeService {


    @Autowired 
    HomeDao dao;

    public TestVO getTestInfo() {
        return dao.getTest();
    }
}
