package com.geekarchitect.patterns.mediator.demo02;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

@Data
public class TextFieldComp extends JTextField {
    private static final Logger LOG = LoggerFactory.getLogger(TextFieldComp.class);
    private ListComp listComp;
    private StateBarComp stateBarComp;

    public static final String TIP = "请输入...";

    public TextFieldComp() {
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
                stateBarComp.setText("文本框：insertUpdate事件");
                TextFieldComp.this.filterList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                stateBarComp.setText("文本框：removeUpdate事件");
                TextFieldComp.this.filterList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                stateBarComp.setText("文本框：changedUpdate事件");
                TextFieldComp.this.filterList();
            }

        });
    }

    private void filterList() {
        String currText = TextFieldComp.this.getText();
        LOG.info("currText:{}", currText);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListModel<String> listModel = listComp.getLIST_MODEL();
                DefaultListModel<String> filteredListModel = new DefaultListModel<>();
                if (currText == null || "".equals(currText.trim())) {
                    filteredListModel = (DefaultListModel<String>) listModel;
                } else {
                    for (int i = 0; i < listModel.getSize(); i++) {
                        String item = listModel.getElementAt(i);
                        if (item.contains(currText)) {
                            filteredListModel.addElement(item);
                        }
                    }
                }
                listComp.setModel(filteredListModel);
                listComp.repaint();
            }
        });
    }

    private void addFocusListener() {
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                stateBarComp.setText("文本框输入中。。。");
                if (TIP.equals(TextFieldComp.this.getText())) {
                    TextFieldComp.this.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(TextFieldComp.this.getText())) {
                    TextFieldComp.this.setText(TIP);
                }
            }
        });
    }

}
