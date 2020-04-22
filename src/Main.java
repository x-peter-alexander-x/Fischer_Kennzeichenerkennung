import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        LPRecognition l = new LPRecognition();
        try {

            System.out.println(l.getData(args[0]));
            System.out.println(l.groupByLocation(l.getData(args[0])));
        }catch (FileNotFoundException e){
            System.out.println("Welcome to the LicenseTemplateReader of Peter Fischer. \n" +
                    "Please give me as first argument the filename which should be processed.");
        }


    }
}
