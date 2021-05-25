import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class One {

    public static void main(String[] args) {


        int num = 10;
        double num1 = 10.0;
        char ch = 'o';
        boolean b = true;
        float fl = 1;
        short sh = 1;
        byte bt = 5;
        long lg = 456987125;

        System.out.println(num >= 10 ? "More than or equal 10" : num < 10 ? "Less than 10" : "Invalid number" );
        System.out.println( lg % 2 == 0 ? "Even number" : lg % 2 != 0 ? "Odd number " + lg/2 : "Invalid number");

        String result = "";

        switch (ch){
            case 'o': result = "Lower case letter"; break;
            case 'O': result = "Upper case letter"; break;
            default: result = "Not acceptable letter";
        }
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        String wrd = scan.nextLine();
     //   System.out.println(a + " " + wrd);
        scan.close();

        while (fl <= 10){
           // System.out.println("Vse Budet Horosho");
            fl++;
        }


        do {
            System.out.println("***");
            fl++;
        } while (fl <= 10);

        String [] res = {"Apple",  "Banana",  "Kiwi"};
        String rev = "";

        for (String each : res ) {
            StringBuffer str = new StringBuffer(each).reverse();
            System.out.println(str);
        }

        int [] a1 = {5,10,48,9};
        int [] a2 = {5,888,99,7,1};
        int [] a3 = new int[a1.length + a2.length];
        int count = 0;

        for (int each : a1){
            a3[count] = each;
            count++;
        }

        for (int each1 : a2){
            a3[count] = each1;
            count++;
        }

        System.out.println(Arrays.toString(a3));


        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.addAll(Arrays.asList("Eggs", "Cheese", "Yogurt","Eggs", "Cheese"));
        System.out.println(shoppingList);

//        Set<String> setList = new LinkedHashSet<>();
//        setList.addAll(shoppingList);
//        System.out.println(setList);

        Map <Object, Object> map1 = new HashMap<>();
        map1.put("name", "Inara");
        map1.put("age", "31");
        map1.put("Gender", "Female");
        System.out.println(map1);

        System.out.println(map1.get("name"));
        System.out.println(map1.get("Gender"));

        Map <Object, Object> map2 =new HashMap<>();
        map2.put("Location", "Illinois");
        map2.putAll(map1);
        System.out.println(map2);

        System.out.println(map2.keySet());
        System.out.println(map2.values());

        Set <Object> str = map2.keySet();
        System.out.println(str +" set of keys");

        Collection <Object> col = map2.values();
        System.out.println("Printing the value" + col);

        //line 99 and line 103 are printing the same. But in line 103 I put the data in collection
        //line 100 and line 106 are printing the same. And here I used collection and stored the data

        // we also can put everything in Entry set interface and we will be able to iterate and have 3 method from that interface
        // which are: getValue(), setValue, getKey()

        Set<Map.Entry<Object, Object>> entrySet = map2.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<Object, Object> eachPair :entrySet ) {

            System.out.println(eachPair);
        }
    }


}
