import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int[] data = readFile("/Users/emilymahoney/IdeaProjects/AoCDay1Puzzle1/puzzInput.txt");
        System.out.println(Arrays.toString(data));

        sumToSum(data);
    }

    public static boolean sumToSum(int[] data) {
        for(int i = 0; i < data.length; i++){
            for(int j = i + 1; j < data.length; j++){

                Integer int1 = data[i];
                Integer int2 = data[j];
                if (data[i] + data[j] == 2020){
                    System.out.println("Answer: " + data[i] * data[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] readFile(String file) {

        try{
            File f = new File(file); //make file
            Scanner s = new Scanner(f);

            int ctr = 0;
            //reads and prints file
            while (s.hasNextLine()) { //get every line in file
                //System.out.println(s.nextLine());
                ctr++;
                s.nextLine();
            }
            int[] ints = new int[ctr];

            Scanner s1 = new Scanner(f);
            for(int i = 0; i < ints.length; i++){
                ints[i] = s1.nextInt();
            }
            return ints;

        } catch (Exception e){
            return null;
        }

    }
}

