package com.geekarchitect.patterns.mediator.demo03;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

@Data
public class ComboboxCompMediator{
    private static final Logger LOG = LoggerFactory.getLogger(ComboboxCompMediator.class);
    private final TextFieldCompColleague textFieldCompColleague;
    private final ListCompColleague listCompColleague;
    private final StateBarCompColleague stateBarCompColleague;

    public ComboboxCompMediator(TextFieldCompColleague textFieldCompColleague, ListCompColleague listCompColleague, StateBarCompColleague stateBarCompColleague) {
        this.textFieldCompColleague = textFieldCompColleague;
        this.listCompColleague = listCompColleague;
        this.stateBarCompColleague = stateBarCompColleague;
    }

    public void setStateBarText(String text) {
        this.stateBarCompColleague.setText(text);
    }

    public void setTextFiledText(String text) {
        this.textFieldCompColleague.setText(text);
    }

    public void filterList() {
        String currText = this.textFieldCompColleague.getText();
        LOG.info("currText:{}", currText);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListModel<String> listModel = ComboboxCompMediator.this.listCompColleague.getLIST_MODEL();
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
                ComboboxCompMediator.this.listCompColleague.setModel(filteredListModel);
                ComboboxCompMediator.this.listCompColleague.repaint();
            }
        });
    }
}
