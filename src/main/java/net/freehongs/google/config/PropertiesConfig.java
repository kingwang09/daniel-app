package net.freehongs.google.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Class PropertiesConfig
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 6. 26.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 6. 26. || 진형은 || 최초생성
 */
@Configuration
@PropertySource("classpath:application.properties")
public class PropertiesConfig {
}
