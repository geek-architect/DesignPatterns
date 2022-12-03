package com.geekarchitect.patterns.mediator.demo03;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

@Data
public class TextFieldCompColleague extends JTextField {
    private static final Logger LOG = LoggerFactory.getLogger(TextFieldCompColleague.class);

    private ComboboxCompMediator comboboxCompMediator;

    public static final String TIP = "请输入...";

    public TextFieldCompColleague() {
        super(TIP);
        this.initListener();
    }

    public void initListener() {
        addFocusListener();
        addDocumentListener();
    }

    private void addDocumentListener() {
        this.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                comboboxCompMediator.setStateBarText("文本框：insertUpdate事件");
                comboboxCompMediator.filterList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                comboboxCompMediator.setStateBarText("文本框：removeUpdate事件");
                comboboxCompMediator.filterList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                comboboxCompMediator.setStateBarText("文本框：changedUpdate事件");
                comboboxCompMediator.filterList();
            }

        });
    }

    private void addFocusListener() {
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                comboboxCompMediator.setStateBarText("文本框输入中。。。");
                if (TIP.equals(TextFieldCompColleague.this.getText())) {
                    TextFieldCompColleague.this.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(TextFieldCompColleague.this.getText())) {
                    TextFieldCompColleague.this.setText(TIP);
                }
            }
        });
    }

}
