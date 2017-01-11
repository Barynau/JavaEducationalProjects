package by.Kazhan;

/**
 * Created by st on 11.01.2017.
 */
public class gasStation
{

  public void  fiilCar(Car car)
  {
      car.fill(car.getmaxTheVolumeOfGasoline()-car.getCurrentTheVolumeOfGasoline());
  }
  public void  fiilCar(Car car, double cash)
  {
      car.fill(car.getmaxTheVolumeOfGasoline()-car.getCurrentTheVolumeOfGasoline());
  }

}
