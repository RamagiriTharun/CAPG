package com.capgemini.packg;

import java.util.Comparator;

public class CatalogSortedListSearch {
        String brands;
    public CatalogSortedListSearch(String brands) {
        this.brands = brands;
    }

    public String getBrands() {
        return brands;
    }

    @Override
    public String toString() {
        return "CatalogSortedListSearch{" +
                "brands='" + brands + '\'' +
                '}';
    }
}
class BrandComparator implements Comparator<CatalogSortedListSearch>{
    @Override
    public int compare(CatalogSortedListSearch o1, CatalogSortedListSearch o2) {
        return o1.brands.compareTo(o2.brands);
    }
}

