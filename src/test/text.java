package test;

import java.util.ArrayList;
import java.util.List;
//0686
public class text {
    public static void main(String[] args){


       /*
        --A. List<List<Integer>> table = new List<List<Integer>>();
        B. List<List<Integer>> table = new ArrayList<List<Integer>>();
        --C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
        --D. List<List,Integer> table = new List<List,Integer>();
        --E. List<List,Integer> table = new ArrayList<List,Integer>();
        --F. List<List,Integer> table = new ArrayList<ArrayList,Integer>();
        */

        //在這裡插入宣告
        List<List<Integer>> table = new ArrayList<List<Integer>>();
        for(int i = 0;i<=10;i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0;j<=10;j++)
                row.add(i*j);
            table.add(row);
        }
        for(List<Integer> row : table){
            System.out.println(row);
        }
    }
}
