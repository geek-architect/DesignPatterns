package com.geekarchitect.patterns.command.demo04;

import com.geekarchitect.patterns.command.demo03.ICommand;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/30
 */
public interface ICommandManager {
    void addCommand(ICommand offlineCommand);
}
