package cn.petalsofcherry.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by luojingyu on 17-7-3.
 */
@Component
@ConfigurationProperties(prefix = "tainguohua")
public class TianGuoHuaPropertie {

    private Double weight;
    private Double clothes;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getClothes() {
        return clothes;
    }

    public void setClothes(Double clothes) {
        this.clothes = clothes;
    }
}
