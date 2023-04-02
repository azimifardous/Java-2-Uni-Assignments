import java.util.ArrayList;
import java.util.Scanner;

public class ColorSorter {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("BLUE"); // initial values
        strArr.add("RED"); // initial values
        
        Scanner sc = new Scanner(System.in);
        String str;

        do {
            System.out.println("Please enter a color name:");
            str = sc.next();

            // since we don't want to add "stop" to the array as well
            if (!str.equals("stop")) {
                strArr.add(str.toUpperCase());

                // Sorting
                for (int i = 0; i < strArr.size() - 1; i++) {
                    for (int j = i + 1; j < strArr.size(); j++) {
                        if (strArr.get(i).compareTo(strArr.get(j)) > 0) {
                            String temp = strArr.get(i);
                            strArr.set(i, strArr.get(j));
                            strArr.set(j, temp);
                        }
                    }
                }

                System.out.println(strArr);
            }
        } while (!str.equals("stop"));

    }
}
