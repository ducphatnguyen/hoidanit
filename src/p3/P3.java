package p3;

import p1.P;

public class P3 extends p1.P {
    private void Test() {
        P firstObj = new P();
        firstObj.a = 10;
        firstObj.b = 10;
        super.c = 10;
        firstObj.d = 10;
    }

    public static void main(String[] args) {

    }
}
