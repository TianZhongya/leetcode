import com.sun.glass.ui.Size;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java . util . * ;
import javax.swing.*;
import javax . swing . Timer ;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        String str="cat dog dog catt",pattern = "abba";
        int num=3;
        Solution a=new Solution();
        System.out.println(a.wordPattern(pattern,str));
    }
}
