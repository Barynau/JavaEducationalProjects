package by.Kazhan;

/**
 * Created by st on 18.01.2017.
 */
public class Store {
   private int[] array;
   private int size;

   public Store() {
      size = 0;
      array = new int[5];
   }

   public void addNewValue(int newValue) {
      if (size == array.length) {
         int[] newArray = new int[size * 2];
         for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
         }
         array = newArray;
      }
      array[size] = newValue;
      size++;
   }

   public int getByIndex(int index) {
      return array[index];
   }

   public int getSize() {
      return size;
   }

   public void removeByIndex(int index) {

      for (int i = index; i < size - 1; i++) {
         array[i - 1] = array[i];
      }
      size--;
      if (array.length / 3 >= size) {
         int[] newArray = new int[array.length / 2];
         for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
         }
         array = newArray;
      }
   }

   public int returnIndexByValue(int value) {

      int rValue = -1;
      for (int i = 0; i < size; i++) {
         if (array[i] == value) {
            rValue = array[i];
            break;
         }

      }
      return rValue;
   }

   public Store returnAllIndexByValue(int value) {

      Store rValue = new Store();
      for (int i = 0; i < size; i++) {
         if (array[i] == value) {
            rValue.addNewValue(array[i]);
         }

      }
      return rValue;
   }
   public void addAray(int[] arr)
   {
      for (int i = 0; i < arr.length; i++) {
         this.addNewValue(arr[i]);
      }
   }
   public void removeByValueFirst(int value) {
      int temp = this.returnIndexByValue(value);
      if (temp != -1) this.removeByIndex(temp);

   }

   public void removeByValueAll(int value) {
      Store temp = new Store();
      temp = this.returnAllIndexByValue(value);
      if (temp.getSize() != 0) {
         for (int i = temp.getSize(); i > 0; i--) {
            this.removeByIndex(temp.getByIndex(i));
         }
      }

   }

   public int getRealSize() {
      return array.length;
   }

}
