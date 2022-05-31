package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int N[]=new int[num];

        for(int i = 0; i<num; i++){
            N[i] = s.nextInt();
        }

        s.close();

        System.out.println(N);
        Arrays.sort(N);
        System.out.println(N[num-1]);
    }
}
