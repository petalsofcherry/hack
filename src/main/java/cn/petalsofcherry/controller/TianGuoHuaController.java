package cn.petalsofcherry.controller;

import cn.petalsofcherry.domain.TianGuoHua;
import cn.petalsofcherry.reposity.TianGuoHuaReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luojingyu on 17-7-3.
 */
@RestController
public class TianGuoHuaController {

    @Autowired
    private TianGuoHuaReposity tianGuoHuaReposity;

    @GetMapping(value = "/tianguohuas")
    public List<TianGuoHua> getList() {
        return tianGuoHuaReposity.findAll();
    }

    @GetMapping(value = "/tianguohua/{weight}")
    public TianGuoHua tianGuoHuaFindOne(@PathVariable("weight") Double weight) {
        return tianGuoHuaReposity.findOneByWeight(weight);
    }



}
