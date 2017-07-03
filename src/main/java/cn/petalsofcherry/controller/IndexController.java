package cn.petalsofcherry.controller;

import cn.petalsofcherry.domain.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luojingyu on 17-7-3.
 */
@RestController
public class IndexController {
    @GetMapping(value="/")
    public Result index() {
        return new Result(0, "index");
    }
}
