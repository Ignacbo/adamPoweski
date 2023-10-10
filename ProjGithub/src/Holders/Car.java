package Holders;

import java.time.LocalDateTime;

public class Car
        <
                WeightType extends Number & Comparable,
                HeightType extends Number & Comparable,
                WidthType extends Number & Comparable

                > implements Comparable <Car> {

    WeightType weight;
    HeightType height;
    WidthType width;
    String brand;

    @Override
    public int compareTo(Car car) {
        int time = LocalDateTime.now().getHour();
        if(time < 12){
            if(this.weight.compareTo(car.weight) > 0) {
                return 1;
            }
            if(this.weight.compareTo(car.weight) < 0){
                return -1;
            }
            return 0;
        }else {
            if(this.weight.compareTo(car.weight) > 0) {
                return 1;
            }else if(this.weight.compareTo(car.weight) < 0){
                return -1;
            }else{
                if(this.height.compareTo(car.height) > 0) {
                    return 1;
                }else if(this.height.compareTo(car.height) < 0){
                    return -1;
                }else{
                    if(this.width.compareTo(car.width) > 0) {
                        return 1;
                    }else if(this.width.compareTo(car.width) < 0){
                        return -1;
                    }
                    return 0;
                }
            }
        }
    }

    public Car(WeightType weight, HeightType height, WidthType width, String brand) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.brand = brand;
    }
}
