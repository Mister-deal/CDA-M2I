package org.example.exercices;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
public class TaquinJeu extends JFrame implements ActionListener {

    private JPanel jPanel;
    private List<JButton> buttons;
    private final int rows = 3;
    private final int cols = 3;

    public TaquinJeu() {
        setTitle("jeu du taquin");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(rows, cols));
        buttons = new ArrayList<>();

        for (int i = 1; i < rows * cols; i++){
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(this);
            buttons.add(button);
            jPanel.add(button);
        }

        Collections.shuffle(buttons);

        for (JButton button : buttons){
            jPanel.add(button);
        }

        add(jPanel);
        setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
       // JButton button = (JButton) e.getSource();
        //int index = buttons.indexOf(button);
    }

    private int getEmptyIndex(){
        for (int i = 0; i < buttons.size() - 1; i++){
            if (!buttons.get(i).getText().equals(Integer.toString(i + 1))){
                return i;
            }
        }
        return -1;
    }

    private void updateButtons(){
        jPanel.removeAll();;
        for (JButton button: buttons){
            jPanel.add(button);
        }
        jPanel.revalidate();
        jPanel.repaint();
    }

}
