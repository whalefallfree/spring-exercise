package com.freefall.springexercise.conditional;

public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "ls";
    }

}
