package com.booktrader.commons.util;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.ArrayList;
import java.util.List;

public class SortFormatted {

    /**
     *  To create de Order list base on String array send in request param
     *  will sort more than 2 fields
     *  sort=[field, direction]
     */
    public List<Order> buildSort(String[] sort) {
        List<Order> orders = new ArrayList<Order>();
        try {
            if (sort[0].contains(",")) {
                for (String sortOrder : sort) {
                    String[] _sort = sortOrder.split(",");
                    orders.add(new Order(getSortDirection(_sort[1]), _sort[0]));
                }
            } else {
                orders.add(new Order(getSortDirection(sort[1]), sort[0]));
            }
        } catch (Exception e) {

        }
        return orders;
    }

    /**
     *  Sets de direction to sort data
     *  Default ASC
     */
    public Sort.Direction getSortDirection(String direction) {
        if (direction.equals("asc")) {
            return Sort.Direction.ASC;
        } else if (direction.equals("desc")) {
            return Sort.Direction.DESC;
        }
        return Sort.Direction.ASC;
    }

}
