public class Date3_18_2 {
    public static void main(String[] args) {
        int age = 29; // => 숫자 30, 29 왔다갔다 하면서 이해
        if (age >= 20) {
            System.out.println("성인입니다");
            if (age >= 30) {
                System.out.println("성인이고, 30대 입니다. 중첩if");
            }
        } else if (age >= 30) { // => 위 true라서 실행X
            System.out.println("성인이고, 30대 입니다. 바깥");
        } else {
            System.out.println("미성년자입니다.");
        }
        System.out.println("분기종료");
    }
}
