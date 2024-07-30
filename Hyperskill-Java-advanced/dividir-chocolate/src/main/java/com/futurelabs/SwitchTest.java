package com.futurelabs;

public class SwitchTest {
    public static void main(String[] args) {
        int var1 = 100;
        int var2 = 0;
        switch (var1) {
            case 100:
                var2 += var1;
            case 200:
                var2 += var1 / 4;
                break;
            case 300:
                var2 += var1 / 10;
                break;
        }
        System.out.println(var2);

        char ch = 'a';
        int num = 0;
        switch(ch) {
            case 'a':
                num = 10;
//                break;
            case 'b':
                num = 20;
//                break;
            default:
                num = 30;
        }
        System.out.println(num);
    }
}
