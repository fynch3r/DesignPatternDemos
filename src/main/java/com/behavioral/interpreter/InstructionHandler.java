package com.behavioral.interpreter;

import com.behavioral.interpreter.node.*;

import java.util.Stack;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 19:09
 **/


public class InstructionHandler {
    private AbstractNode node;


    public void handle(String instruction){
        AbstractNode leftExpression = null, rightExpression = null, direction = null, action = null, distance = null;

        Stack<AbstractNode> stack = new Stack<>();
        String[] words = instruction.split(" ");

        for (int i = 0; i < words.length; i++) {
            if("and".equalsIgnoreCase(words[i])){
                leftExpression = stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                rightExpression = new ExpressionNode(direction,action,distance);
                stack.push(new CompositeNode(leftExpression,rightExpression));
            }else{
                //正常解析，压栈
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                // 组成左子句，压栈
                leftExpression = new ExpressionNode(direction, action, distance);
                stack.push(leftExpression);
            }
        }
        //将最终结果弹出
        this.node = stack.pop();
    }


    public String output(){
        return this.node.interpret();
    }


}
