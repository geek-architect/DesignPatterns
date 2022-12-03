package com.geekarchitect.patterns.mediator.demo03;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

@Data
public class ListCompColleague extends JList<String> {
    private static final Logger LOG = LoggerFactory.getLogger(ListCompColleague.class);

    private ComboboxCompMediator comboboxCompMediator;
    private DefaultListModel<String> LIST_MODEL;

    public ListCompColleague(DefaultListModel<String> LIST_MODEL) {
        super(LIST_MODEL);
        this.LIST_MODEL = LIST_MODEL;
        setModel(this.LIST_MODEL);
        this.setLayoutOrientation(JList.VERTICAL);
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.initListener();
    }

    public void initListener() {
        this.addFocusListener();
        this.addListSelectionListener();
    }

    private void addListSelectionListener() {
        this.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String selectedValue = ListCompColleague.this.getSelectedValue();
                if (selectedValue != null && !"".equals(selectedValue)) {
                    LOG.info("selectedValue:{}", selectedValue);
                    comboboxCompMediator.setStateBarText("列表框选中项：" + selectedValue);
                    comboboxCompMediator.setTextFiledText(selectedValue);
                }
            }
        });
    }

    private void addFocusListener() {
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                comboboxCompMediator.setStateBarText("请在列表框中选择");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }

}
