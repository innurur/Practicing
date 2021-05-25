public class Two {

    public static void main(String[] args) {

        System.out.println(division(20,3));

        unique("Inna");

        findUnique("I1n2a1");

    }

    public static int division(int num1, int num2){

        int result = 0 ;


       while(num1 >= num2){
           num1 -= num2;
           result++;
       }

        return result;
    }

    public static void unique (String str){ //Inna

        String result = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (! result.contains(str.charAt(i)+"")){
                result += str.charAt(i)+"";
                count++;
            }
        }

        System.out.println(result);

    }

    public static void findUnique(String str1){ //Inna Inna

        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {

                if (str1.charAt(i) == str1.charAt(j)){
                    count++;
                }

            }

            if (count == 1){
                result += str1.charAt(i);
                break;
            }

        }

        System.out.println(result);

    }
}
