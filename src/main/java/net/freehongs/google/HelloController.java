package net.freehongs.google;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Class net.freehongs.google.HelloController
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 6. 25.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 6. 25. || 진형은 || 최초생성
 */
@Controller
public class HelloController {

  private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

  @RequestMapping("/hello")
  public String hello(){
    logger.info("Hello world!!");
    return "hello";
  }
}
