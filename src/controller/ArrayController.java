package controller;

public class ArrayController {
    public ArrayController(){};

    public int countNegatives(int[] arr, int lenght) {
        // Você começa do final do array até o começo, já que esse é um valor conhecido (0)
        if(lenght <= 0) return 0;

        // 1 - sim, 0 - não
        int isNegative = arr[lenght-1] < 0 ? 1 : 0;

        // Ao encontrar um negativo, somar 1 ao retorno e checar o próximo valor
        // Caso o valor atual não for negativo não somar (ou somar 0) ao retorno e checar o próximo valor
        return isNegative + countNegatives(arr, --lenght);
    }
}
