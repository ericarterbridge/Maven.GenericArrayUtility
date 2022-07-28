package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] inputArray;
    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count = 0;
        for (T arrElement : arrayToMerge){
            if (arrElement == valueToEvaluate){
                count++;
            }
        }
        for (T arrElement : inputArray){
            if (arrElement == valueToEvaluate){
                count++;
            }
        } return count;
    }

    public T[] removeValue(T valueToRemove) {
        List<T> newList = new ArrayList<>();
        for (T arrElement : inputArray){
            if (arrElement != valueToRemove){
                newList.add(arrElement);
            }
        }
        //T[] modifiedArr = (T[])newList.toArray(new Object[0]);
        T[] modifiedArr = (T[])new Object[newList.size()];
        modifiedArr = newList.toArray(modifiedArr);
        return modifiedArr;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        Integer count = 0;
        T item = null;
        List<T> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(inputArray));
        newList.addAll(Arrays.asList(arrayToMerge));
        for (T element : newList){
            if (getNumberOfOccurrences(element) > count){
                count = getNumberOfOccurrences(element);
                item = element;
            }
        }

        return item;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (T element : inputArray){
            if (element == valueToEvaluate){
                count++;
            }
        }
        return count;
    }
}
