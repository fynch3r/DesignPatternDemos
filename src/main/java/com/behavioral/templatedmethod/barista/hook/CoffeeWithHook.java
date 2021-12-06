package com.behavioral.templatedmethod.barista.hook;

import com.behavioral.templatedmethod.barista.CaffeineBeverageWithHook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 09:57
 **/


public class CoffeeWithHook extends CaffeineBeverageWithHook
{

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            answer = in.readLine();

        }catch (Exception e){
            System.err.println("IO error trying to read your answer");
        }

        if(answer == null){
            return "n";
        }
        return answer;


    }




}
