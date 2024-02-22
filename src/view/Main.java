package view;

import controller.ArrayController;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -1, 1, -1, -1};

        var arrCont = new ArrayController();

        System.out.println(arrCont.countNegatives(arr, arr.length));
    }
}