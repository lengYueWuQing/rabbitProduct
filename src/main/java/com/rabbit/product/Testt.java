package com.rabbit.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(null);
        list.add("2");
        list.add("");
        String aa = list.get(2);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
