package Tetris;
import java.awt.*;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.event.*;

import java.awt.Toolkit;

/*
Cung cap toa do x, y cua tung hinh
*/

public class TPoint implements Comparable<TPoint> {
    public int x;
    public int y;
    
   
    public int compareTo(TPoint other) {  // ghi ?è ph??ng th?c 
        if(this.x == other.x && this.y == other.y)return 0;
        return 1;
    }
   
    public TPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public TPoint(TPoint point) {
        this.x = point.x;
        this.y = point.y;
    }

    public boolean equals(Object other) {
        if (this == other) return true;// so sanh ??a ch? 2 d?i t??ng
        if (!(other instanceof TPoint)) return false;

        TPoint pt = (TPoint) other;// n?u 2 ??i t??ng khác ??a ch?
        return (x == pt.x && y == pt.y);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}