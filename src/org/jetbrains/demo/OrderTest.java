package org.jetbrains.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kamdem
 */
class OrderTest {
    @Test
    void shouldBeAbleToCreateANewOrder(){
        Order order = new Order(23);
        assertNotNull(order);
    }
}