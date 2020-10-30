# Algorithm
  I like God do not play with dice and do not believe in coincidence. I just believe that strving will not disappoint me, in this world. 
  
  Starting from today(12-25-2019), insist on every day, from the basic algorithm to leetcode, write an algorithm and his optimal solution

## [Bubble Sort](https://github.com/Gqijian/algorithm/blob/master/algorithm/src/main/java/com/gao/sort/BubbleSort.java)

```
    public int[] bubbleSort(int[] arr){

        boolean flag = false; 
        int tmp;

        for(int i=0; i<arr.length-1; i++){

            for(int j=0; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }else {
                flag = false;
            }

        }

        return arr;
    }
```

## [Select Sort](https://github.com/Gqijian/algorithm/blob/master/algorithm/src/main/java/com/gao/sort/SelectSort.java)

```
public int[] selectSort(int[] arr){

        for (int i=0; i<arr.length-1; i++){

            int minIndex = i;
            int min = arr[i];

            for(int j=0+i; j<arr.length; j++){

                //找出 最小值与他的下标
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }

            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
```
## [Insert Sort](https://github.com/Gqijian/algorithm/blob/master/algorithm/src/main/java/com/gao/sort/InsertSort.java)
```
    public static void insertSort(int[] arr) {

        int insertVal = 0;
        int insertIndex = 0;
        
        for (int i = 1; i < arr.length; i++) {
            
            insertVal = arr[i];
            insertIndex = i - 1; // 即 arr[1]的前面这个数的下标
            
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
                insertIndex--;
            }
            
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }
```

## [Shell Sort](https://github.com/Gqijian/algorithm/blob/master/algorithm/src/main/java/com/gao/sort/ShellSort.java)
```
    public static int[] shellSortFinal(int[] arr) {

        int tmp = 0;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            // 从第 gap 个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {

                int j = i;
                int temp = arr[j];

                if (arr[j] < arr[j - gap]) {

                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    
                    //当退出 while 后，就给 temp 找到插入的位置
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
```


# Leetcode
Here are the topics related to leetcode, I will try to make some ideas and explanations

[TwoSum My solution](https://github.com/Gqijian/algorithm/blob/master/algorithm/src/main/java/com/gao/leetcode/TwoSum.java)
```
经典的第一题<两数之和>，[Leetcode url](https://leetcode.com/problems/two-sum/)
```

