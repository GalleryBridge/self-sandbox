package cn.laidor.maincontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Laidor
 * @Description: 测试
 * @Date:2024/11/28 下午 10:04
 */
@RestController("/")
public class MainController {

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
