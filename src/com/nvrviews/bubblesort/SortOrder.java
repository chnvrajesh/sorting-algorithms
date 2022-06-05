package com.nvrviews.bubblesort;

public enum SortOrder {
    DESC,
    ASC;

    public static boolean contains( String value ){
        for(SortOrder order : SortOrder.values()){
            if(order.toString().equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }
}
