package net.freehongs.google;

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
  @RequestMapping("/hello")
  public String hello(){
    return "hello";
  }
}
