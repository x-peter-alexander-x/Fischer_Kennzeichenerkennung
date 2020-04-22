import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LPRecognition {


    public static ArrayList<String> getData(String file) throws FileNotFoundException {
        ArrayList<String> data = new ArrayList<String>();
        Scanner fileIn = new Scanner(new File(file));
        Pattern p = Pattern.compile("[A-Z]{1,2}[-][A-Z0-9]{3,6}");


        while (fileIn.hasNext()) {
            String s = fileIn.next();
            Matcher m = p.matcher(s);

            if (m.matches()) {
                if (!data.contains(s)) {
                    data.add(s);
                }
            }
        }
        Collections.sort(data);
        return data;
    }

    public static ArrayList<String> groupByLocation(ArrayList<String> stringList) {
        ArrayList<String> grouped = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<Countries> laender = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            String c = stringList.get(i);

            grouped.add(c.split("-")[0]);

        }
        return numbers;
    }
}

