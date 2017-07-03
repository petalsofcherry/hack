package cn.petalsofcherry.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by luojingyu on 17-7-3.
 */
@Component
@Aspect
public class HappyAspect {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HappyAspect.class);

    @Pointcut(value = "execution(public * cn.petalsofcherry.controller.TianGuoHuaController.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore() {
        logger.info("doBefore");
    }


    @After("log()")
    public void doAfter() {
        logger.info("doAfter");
    }
}
