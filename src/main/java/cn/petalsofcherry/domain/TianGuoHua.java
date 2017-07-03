package cn.petalsofcherry.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;

/**
 * Created by luojingyu on 17-7-3.
 */
@Entity
public class TianGuoHua {

    @Id
    @GeneratedValue
    private Integer id;

    @Max(value = 150, message = "你该减肥了")
    private Double weight;

    private Double clothes;


    public Double getClothes() {
        return clothes;
    }

    public void setClothes(Double clothes) {
        this.clothes = clothes;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tinguohua{" +
                "id=" + id +
                ",weight=" + weight +
                ",clothes=" + clothes +
                "}";
    }
}
