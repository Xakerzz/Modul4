package Rect;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Rect;

public class SRect {
    private int s;
    int w, h;

    SRect(int w, int h) {
        this.w = w;
        this.h = h;
        s = w * h;
    }

    int getS() {
        return s;
    }

    int getW() {
        return w;
    }

    int getH() {
        return h;
    }

    public static void main(String[] args) {
        SRect r = new SRect(20,30) ;
        System.out.println(r.s);

        System.out.println(r.s);
        System.out.println(r.getW()*r.getH()==r.getS());

    }
}

