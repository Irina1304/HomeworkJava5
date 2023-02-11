import java.util.HashMap;
import java.util.TreeMap;


/*1) Создать словарь HashMap. Обобщение <Integer, String>.
2) Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)
3) Изменить значения дописав восклицательные знаки.
4) *Создать TreeMap, заполнить аналогично.
5) *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
6) **Сравнить время последовательного и случайного перебора тысячи элементов словарей.*/

public class homework5 {


    /**
     * @param args
     */
    public static void main(String[] args) {

        /*1) Создать словарь HashMap. Обобщение <Integer, String>.
        2) Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)*/

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "green");
        map.put(3, "blue");
        System.out.println(map);

        //2) Изменить значения дописав восклицательные знаки.

        map.put(1, "red!");
        map.put(2, "green!");
        map.put(3, "blue!");
        System.out.println(map);

        //4) *Создать TreeMap, заполнить аналогично.

        TreeMap<Integer,String> trm = new TreeMap();
        trm.put(1, "red!");
        trm.put(2, "yellow!");
        trm.put(3, "blue!");
        System.out.println(trm);

        //5) *Увеличить количество элементов до 1000 случайными ключами и общей строкой.

        for (int i = 0; i < 1000; i++){
            map.put(i, "+");
        }
        for (int j = 0; j < 1000; j++){
            trm.put(j, "+");
        }
        System.out.println(map);
        System.out.println(trm);


        // 6) **Сравнить время последовательного и случайного перебора тысячи элементов словарей.

        long start1 = System.currentTimeMillis();
        for (Integer key: map.keySet())
            map.get(key);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (Integer key: trm.keySet())
            trm.get(key);
        long end2 = System.currentTimeMillis();
        
        System.out.println("Время перебора map: " + (end1 - start1));
        System.out.println("Время перебора trm: " + (end2 - start2));




    }
    
}
