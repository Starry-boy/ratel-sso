package com.ratel.sso.swagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ratel
 * @date 2020/3/3
 */
@Controller
@RequestMapping("swagger")
@Slf4j
public class SwaggerController {

    @RequestMapping("/swagger-resources")
    public String resource() {
        return "forward:/swagger-resources";
    }

    @RequestMapping("/swagger-resources/configuration/ui")
    public String ui() {
        return "forward:/swagger-resources/configuration/ui";
    }

    @RequestMapping("/v2/api-docs")
    public String doc() {
        return "forward:/v2/api-docs";
    }
    @RequestMapping("/swagger-resources/configuration/security")
    public String security() {
        return "forward:/swagger-resources/configuration/security";
    }
}
