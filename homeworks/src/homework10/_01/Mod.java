package homework10._01;

import java.util.HashMap;

class ModTest {
    public static void main(String[] args) {
        int[] dizi = {5, 5, 5, 10, 10, 15, 15, 15, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
        System.out.println(Mod.mode(dizi));
    }
}

public class Mod {
    public static int mode(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int max = 1;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            if (hm.get(array[i]) != null) {

                int count = hm.get(array[i]);
                count++;
                hm.put(array[i], count);

                if (count > max) {
                    max = count;
                    temp = array[i];
                }
            } else
                hm.put(array[i], 1);
        }
        return temp;
    }
}