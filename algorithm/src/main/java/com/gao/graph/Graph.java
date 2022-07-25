package com.gao.graph;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author gaoqijian
 * @create 2022-07-25 21:36
 */
@Data
public class Graph
{
    //存储顶点
    private ArrayList<String> vertexList;

    //存储图对应的领结矩阵
    private Integer[][] edges;

    //边总数
    private int numOfEdges;

    public Graph(Integer n){
        edges = new Integer[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
    }

    /**
     * 获取顶点个数
     * @return
     */
    public Integer getNumOfVertex(){
        return vertexList.size();
    }

    /**
     * 返回边的总数
     * @return
     */
    public Integer getNumOfEdges(){
        return numOfEdges;
    }

    /**
     * 返回节点 i 的下标对应的数据
     * @param i
     * @return
     */
    public String getValueByIndex(Integer i){
        return vertexList.get(i);
    }

    /**
     * 返回权值
     * @param x
     * @param y
     * @return
     */
    public Integer getWeight(Integer x, Integer y){
        return edges[x][y];
    }

    /**
     * 展示图
     */
    public void showGraph(){
        for (Integer[] link : edges)
        {
            System.out.println(Arrays.toString(link));
        }
    }

    /**
     * 添加节点
     * @param vertex
     */
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    /**
     * 添加边
     * @param x X第一个顶点
     * @param y Y第二个顶点
     * @param weight
     */
    public void insertEdge(Integer x, Integer y, Integer weight){

        //无向图
        edges[x][y] = weight;
        edges[y][x] = weight;

        numOfEdges++;
    }
}
