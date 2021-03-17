package part1;

import java.util.Arrays;

class Task_3 {
    public static void main(String[] args) {
        String [][] array = new String[5][5];
        int i,j;
        for (i=0;i<array.length;i++){
            for(j=0;j<array[i].length;j++){
               array[i][j] = "A";
               System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
