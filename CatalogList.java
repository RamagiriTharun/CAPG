package com.capgemini.packg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CatalogList {
    static void ListInput() {
        Scanner sc = new Scanner(System.in);
        List<CatalogSortedListSearch> li = new ArrayList<CatalogSortedListSearch>();
        String s = sc.nextLine();
        while (!s.equalsIgnoreCase("and")) {
            li.add(new CatalogSortedListSearch(s));
            s = sc.nextLine();
        }
        String search = sc.nextLine();
        Collections.sort(li,new BrandComparator());
        for (CatalogSortedListSearch st : li) {
            System.out.println(st);
        }
        System.out.println(search);
    }
    public static void main(String[] args) {
        ListInput();
    }
}
