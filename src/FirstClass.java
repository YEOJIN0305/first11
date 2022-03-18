public class FirstClass {
    public static void main(String[] args){
        int x; // 선언
        x = 2; // 초기화
        int y = 3; // 선언과 초기화
        int z = x + y; // =>연산
        System.out.print("Z 값은 "+z +"\n");
        System.out.println("Z 값은 "+z);
        System.out.println(x + " + " + y + " = " + z);//자동 형변환
        System.out.printf("%d + %d + %d", x, y, z);
    }
}
