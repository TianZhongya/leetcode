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
        int[][] left={{1,0,1},{1,1,0},{1,1,0}};
        int[] right={4};
        int num=9;
        Solution a=new Solution();
        System.out.println(a.numSubmat(left).toString());
    }
}
