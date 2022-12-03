package com.geekarchitect.patterns.mediator.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CompLibV2 {
    private static final Logger LOG = LoggerFactory.getLogger(CompLibV2.class);

    public void init() {
        JFrame CompLibFrame = new JFrame("自定义组件");
        CompLibFrame.setSize(600, 600);
        CompLibFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel comboboxPanel = createComboboxPanel();

        CompLibFrame.add(comboboxPanel);
        CompLibFrame.setVisible(true);
    }

    private static JPanel createComboboxPanel() {
        JPanel comboboxPanel = new JPanel();
        comboboxPanel.setLayout(new BorderLayout());

        StateBarCompColleague stateBarComp = new StateBarCompColleague();
        TextFieldCompColleague textFieldComp = new TextFieldCompColleague();

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addAll(Arrays.asList("《设计原本》", "《设计模式：可复用面向对象软件的基础》", "《代码不朽》", "《Google软件工程》", "《JAVA编程思想》"));
        ListCompColleague listComp = new ListCompColleague(listModel);

        ComboboxCompMediator comboboxCompMediator = new ComboboxCompMediator(textFieldComp, listComp, stateBarComp);

        textFieldComp.setComboboxCompMediator(comboboxCompMediator);
        listComp.setComboboxCompMediator(comboboxCompMediator);

        comboboxPanel.add(textFieldComp, BorderLayout.NORTH);
        comboboxPanel.add(listComp, BorderLayout.CENTER);
        comboboxPanel.add(stateBarComp, BorderLayout.SOUTH);
        return comboboxPanel;
    }

    public static void main(String[] args) {
        CompLibV2 compLib = new CompLibV2();
        compLib.init();
    }
}
