package com.wang.queue;

import lombok.Data;

/**
 * 数组模拟队列
 *
 * @author gaoqijian
 * @create 2022-04-30 16:23
 */
public class ArrayQueue
{

}

@Data
class QueueDemo{

    //最大容量
    private int maxSize;

    //队列头
    private int front;

    //队列尾巴
    private int rear;

    //用于存放数据
    private int[] arr;

    public QueueDemo(int arrSize){
        this.maxSize = arrSize;
        arr = new int[maxSize];

        //队列头
        front = -1;
        //队列尾
        rear = -1;
    }
}
