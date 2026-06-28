package com.xworkz.collection.runner;

import com.xworkz.collection.dto.OrderDTO;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class OrderRunner {
    public static void main(String[] args) {

        OrderDTO orderDTO1 = new OrderDTO("101", "C176", LocalDate.of(2026, 6, 26), "Delivered", 45000);
        OrderDTO orderDTO2 = new OrderDTO("102", "C192", LocalDate.of(2026, 6, 27), "Pending", 18000);
        OrderDTO orderDTO3 = new OrderDTO("103", "C173", LocalDate.of(2026, 6, 28), "Shipped", 32000);
        OrderDTO orderDTO4 = new OrderDTO("104", "C164", LocalDate.of(2026, 6, 29), "Cancelled", 12000);
        OrderDTO orderDTO5 = new OrderDTO("105", "C185", LocalDate.of(2026, 6, 30), "Processing", 27000);

        Collection<OrderDTO> orderDTOs = new LinkedList<>();

        orderDTOs.add(orderDTO1);
        orderDTOs.add(orderDTO2);
        orderDTOs.add(orderDTO3);
        orderDTOs.add(orderDTO4);
        orderDTOs.add(orderDTO5);

        System.out.println("Total Orders : " + orderDTOs.size());

        for (OrderDTO order : orderDTOs) {
            System.out.println(order);
        }
    }
}
