package study.home;

import org.springframework.web.bind.annotation.RestController;

import study.home.vo.TestVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    HomeService svc;

    @PostMapping("/test")
    public TestVO testController() {

        TestVO vo = svc.getTestInfo();

        logger.debug("success : {}", vo);
        logger.info("info logger check {}", vo);


        return vo;
    }
    
}
