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

# Leetcode
Here are the topics related to leetcode, I will try to make some ideas and explanations

## [TwoSum](https://github.com/Gqijian/algorithm/blob/master/algorithm/src/main/java/com/gao/leetcode/TwoSum.java)
```
经典的第一题二数之和，[Leetcode url](https://leetcode.com/problems/two-sum/)
```

