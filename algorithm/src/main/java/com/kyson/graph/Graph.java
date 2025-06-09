package com.kyson.graph;

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

    private boolean[] isVis;

    public Graph(Integer n)
    {
        edges = new Integer[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
        isVis = new boolean[5];
    }

    /**
     * 获取顶点个数
     *
     * @return
     */
    public Integer getNumOfVertex()
    {
        return vertexList.size();
    }

    /**
     * 返回边的总数
     *
     * @return
     */
    public Integer getNumOfEdges()
    {
        return numOfEdges;
    }

    /**
     * 返回节点 i 的下标对应的数据
     *
     * @param i
     * @return
     */
    public String getValueByIndex(Integer i)
    {
        return vertexList.get(i);
    }

    /**
     * 返回权值
     *
     * @param x
     * @param y
     * @return
     */
    public Integer getWeight(Integer x, Integer y)
    {
        return edges[x][y];
    }

    /**
     * 展示图
     */
    public void showGraph()
    {
        for (Integer[] link : edges)
        {
            System.out.println(Arrays.toString(link));
        }
    }

    /**
     * 添加节点
     *
     * @param vertex
     */
    public void insertVertex(String vertex)
    {
        vertexList.add(vertex);
    }

    /**
     * 添加边
     *
     * @param x      X第一个顶点
     * @param y      Y第二个顶点
     * @param weight
     */
    public void insertEdge(Integer x, Integer y, Integer weight)
    {

        //无向图
        edges[x][y] = weight;
        edges[y][x] = weight;

        numOfEdges++;
    }

    /**
     * 得到第一个领结节点的下标 w
     *
     * @param index
     * @return
     */
    public Integer getFirstNeighbor(Integer index)
    {
        for (int j = 0; j < vertexList.size(); j++)
        {
            if (edges[index][j] > 0)
            {
                return j;
            }
        }
        return -1;
    }

    /**
     * 根据前一个领接节点下标来获取下一个邻接节点
     *
     * @param x
     * @param y
     * @return
     */
    public Integer getNextNeighbor(Integer x, Integer y)
    {
        for (Integer j = y + 1; j < vertexList.size(); j++)
        {
            if (edges[x][j] > 0)
            {
                return j;
            }
        }

        return -1;
    }

    public void dfs(boolean[] isVis, Integer i)
    {
        System.out.println(getValueByIndex(i) + " -> ");
    }

    public static void main(String[] args)
    {
        Integer n = 5;
        String[] vertexVals = {"A", "B", "C", "D", "E"};


        Graph graph = new Graph(n);

        for (String val : vertexVals)
        {
            graph.insertVertex(val);
        }

        //添加边 A-B A-C B-C B-D B-E
        graph.insertEdge(0, 1, 1);  //A-B
        graph.insertEdge(0, 2, 1);  //A-C
        graph.insertEdge(1, 2, 1);  //B-C
        graph.insertEdge(1, 3, 1);  //B-D
        graph.insertEdge(1, 4, 1);  //B-E

        graph.showGraph();

    }
}
