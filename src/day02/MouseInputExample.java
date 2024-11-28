package day02;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInputExample  {
    public static void main(String[] args) {
        // 创建一个 JFrame 实例
        JFrame frame = new JFrame("Mouse Input Example");

        // 设置窗口的默认关闭操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口的大小
        frame.setSize(400, 300);

        // 创建一个 JPanel 实例
        JPanel panel = new JPanel();

        // 添加鼠标监听器
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 获取鼠标点击的坐标
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse clicked at (" + x + ", " + y + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 获取鼠标按下的坐标
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse pressed at (" + x + ", " + y + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 获取鼠标释放的坐标
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse released at (" + x + ", " + y + ")");
            }
        });

        // 添加鼠标移动监听器
        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // 获取鼠标移动的坐标
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse moved to (" + x + ", " + y + ")");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // 获取鼠标拖动的坐标
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse dragged to (" + x + ", " + y + ")");
            }
        });

        // 将 JPanel 添加到 JFrame 中
        frame.add(panel);

        // 设置窗口可见
        frame.setVisible(true);
    }
}