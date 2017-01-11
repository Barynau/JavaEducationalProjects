package by.Kazhan;

/**
 * Created by st on 11.01.2017.
 */
public class Car {
    private double currentTheVolumeOfGasoline=0; //текущий обьём бензина
    private double maxTheVolumeOfGasoline=0; //максимальный обьём бензина
    private double currentMileage=0; //текущий пробег
    private double fuelConsumption=0; //расход топлива на сто километров


    public Car(double mTVOG,double currentVOG, double consumption) {

        currentTheVolumeOfGasoline = currentVOG;
        maxTheVolumeOfGasoline = mTVOG;
        fuelConsumption = consumption;
    }


    //кнопка +1
    public void fill(double volume ) {
       if (currentTheVolumeOfGasoline+volume<maxTheVolumeOfGasoline)
       {currentTheVolumeOfGasoline+=volume;}
        else{
           System.out.println("Если вы заправите "+volume+" литров бак переполнится. Вы можете заправить " +(maxTheVolumeOfGasoline-currentTheVolumeOfGasoline));
       }
    }
    public void toGo(double range)
    {
        if((currentTheVolumeOfGasoline/fuelConsumption*100)>range)
        {
            currentMileage+=range;

        }
    }

    //экран, показывает тек. значение
    public double getCurrentTheVolumeOfGasoline() {
        return currentTheVolumeOfGasoline;
    }

   
}
