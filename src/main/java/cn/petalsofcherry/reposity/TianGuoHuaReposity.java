package cn.petalsofcherry.reposity;

import cn.petalsofcherry.domain.TianGuoHua;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by luojingyu on 17-7-3.
 */
public interface TianGuoHuaReposity extends JpaRepository<TianGuoHua, Integer> {
    public List<TianGuoHua> findByWeight(Double weight);
    public TianGuoHua findOneByWeight(Double weight);
}
