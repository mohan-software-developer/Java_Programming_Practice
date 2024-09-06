package part3;

import java.util.*;

public class Sorting {

    // Insertion Sort
    public static void insertionSort(Product[] products) {
        for (int i = 1; i < products.length; i++) {
            Product key = products[i];
            int j = i - 1;
            while (j >= 0 && products[j].getProductId() > key.getProductId()) {
                products[j + 1] = products[j];
                j--;
            }
            products[j + 1] = key;
        }
    }

    // Bubble Sort
    public static void bubbleSort(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].getProductId() > products[j + 1].getProductId()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    public static void mergeSort(Product[] products) {
        if (products.length < 2) {
            return;
        }
        int mid = products.length / 2;
        Product[] left = new Product[mid];
        Product[] right = new Product[products.length - mid];

        System.arraycopy(products, 0, left, 0, mid);
        System.arraycopy(products, mid, right, 0, products.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(products, left, right);
    }

    private static void merge(Product[] products, Product[] left, Product[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getProductId() <= right[j].getProductId()) {
                products[k++] = left[i++];
            } else {
                products[k++] = right[j++];
            }
        }

        while (i < left.length) {
            products[k++] = left[i++];
        }

        while (j < right.length) {
            products[k++] = right[j++];
        }
    }
    // Quick Sort
    public static void quickSort(Product[] products, int low, int high) {
        if (low < high) {
            int pi = partition(products, low, high);
            quickSort(products, low, pi - 1);
            quickSort(products, pi + 1, high);
        }
    }

    private static int partition(Product[] products, int low, int high) {
        Product pivot = products[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (products[j].getProductId() < pivot.getProductId()) {
                i++;
                Product temp = products[i];
                products[i] = products[j];
                products[j] = temp;
            }
        }
        Product temp = products[i + 1];
        products[i + 1] = products[high];
        products[high] = temp;
        return i + 1;
    }
}
