
package com.flappybird.view;

public class Window{
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    public Window() {
         PlayHub P = new PlayHub();
        P.setVisible(true);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            
            Window window = new Window();
            
        });
    }
}
