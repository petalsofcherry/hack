package cn.petalsofcherry.utils;

import cn.petalsofcherry.domain.Result;

/**
 * Created by luojingyu on 17-7-3.
 */
public class ResultUtils {

    public static Result success(Object object) {
        return new Result(0, "成功", object);
    }

    public static Result success() {
        return new Result(0, "成功");
    }

    public static Result error(String msg) {
        return new Result(1, msg);
    }
}
