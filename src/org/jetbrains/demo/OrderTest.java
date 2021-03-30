package org.jetbrains.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kamdem
 */
class OrderTest {
    @Test
    void shouldBeAbleToCreateANewOrder(){
        String actualDescription = "description";
        Order order = new Order(23, actualDescription);
        assertNotNull(order);
        assertEquals(actualDescription, order.getDescription());
    }
}