package test.util;

import javax.swing.JOptionPane;
import java.awt.Frame;
import java.io.UnsupportedEncodingException;

public class PopWindow
{
    public static void getFrame(Result result) throws UnsupportedEncodingException
    {
        String str=result.isSuccess()?"操作成功":"操作失败";
        JOptionPane.showMessageDialog(new Frame(), result.getMessage(),str, JOptionPane.WARNING_MESSAGE);
    }
}
