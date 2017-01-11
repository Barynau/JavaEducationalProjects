package by.Kazhan;

/**
 * Created by st on 11.01.2017.
 */
public class Counter {
    //никто снаружи его не видит!
    private int currentValue; //текущее значение


    //кнопка +1
    public void plusOne() {
        currentValue++;
        if (currentValue > 20)
            currentValue = 0;
    }

    //экран, показывает тек. значение
    public int getCurrentValue() {
        return currentValue;
    }

    //кнопка ноль
    public void setZero() {
        currentValue = 0;
    }
}
