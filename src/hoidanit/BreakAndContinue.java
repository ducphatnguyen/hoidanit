package hoidanit;

// Phân biệt break và continue
public class BreakAndContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            if(i == 4) {
//                break; // 0 1 2 3
                continue; // 012356789
            }
            System.out.println(i);
        }
    }
}
