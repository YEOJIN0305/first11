package Etc;

public class D20220509_2 {
    public static void main(String[] args) {
        /*크기 10배열 1~10 입력 for문 출력 while*/

        int num[] = new int[10];
        int j = 0;
        int k = 10;

        for (int i = 0; i<num.length; i++){
            num[i] = k;
            k+=10;
        }
        while(j< num.length){
            System.out.println(num[j]);
            j++;
        }
    }
}
