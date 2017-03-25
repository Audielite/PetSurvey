package com.lex;

import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by alexishennings on 3/22/17.
 */

        public class PetSurvey extends JFrame {
            private JCheckBox dogCheckBox;
            private JCheckBox catCheckBox;
            private JCheckBox fishCheckBox;
            private JButton submitButton;
            private JLabel resultsLabel;
            private JPanel mainpANEL;
            private JButton quitButton;

            private boolean dog;
            private boolean cat;
            private boolean fish;

            protected PetSurvey() {

                setContentPane(mainpANEL);
                pack();
                setVisible(true);
                setTitle("Pet survey program");
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setSize(new Dimension(450, 250));

                dogCheckBox.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        dog = dogCheckBox.isSelected();
                        updateResults();

                    }
                });

                catCheckBox.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        cat = catCheckBox.isSelected();
                        updateResults();

                    }
                });

                fishCheckBox.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        fish = fishCheckBox.isSelected();
                        updateResults();

                    }
                });

                quitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }

            private void updateResults() {
                String hasDog = dog ? "one dog" : "no dogs";
                String hasCat = cat ? "one cat" : "no cats";
                String hasFish = fish ? "one fish" : "no fish";

                String results = "You have " + hasDog + " and " + hasCat + " and " + hasFish;
                resultsLabel.setText(results);
            }
}