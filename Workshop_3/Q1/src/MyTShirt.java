/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MyTShirt implements ITShirt {

    @Override
    public int f1(TShirt[] t) {
        int count = 0;
        for (TShirt tShirt : t) {
            char firstLetter = tShirt.getStyle().charAt(0);
            if (Character.isDigit(firstLetter)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public void f2(TShirt[] t) {
        int count = 0;
        for (TShirt tShirt : t) {
            if (tShirt.getSize() >= 3) {
                count++;
            }
        }

        TShirt[] newTShirt = new TShirt[count];
        int n = 0;
        for (TShirt tShirt : t) {
            if (tShirt.getSize() >= 3) {
                newTShirt[n] = tShirt;
                n++;
            }
        }
        for (TShirt tShirt : newTShirt) {
            System.out.print("(" + tShirt.getStyle() + ", " + tShirt.getSize() + ") ");
        }
        System.out.print("\n");
    }

    @Override
    public void f3(TShirt[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (Character.compare(t[j].getStyle().charAt(1), t[j + 1].getStyle().charAt(1)) > 0) {
                    TShirt swap = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = swap;
                }
            }
        }

        for (TShirt tShirt : t) {
            System.out.print("(" + tShirt.getStyle() + ", " + tShirt.getSize() + "), ");
        }
        System.out.print("\n");
    }

}
