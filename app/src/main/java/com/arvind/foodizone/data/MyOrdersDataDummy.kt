package com.arvind.foodizone.data

import com.arvind.foodizone.R
import com.arvind.foodizone.model.MyOrders

object MyOrdersDataDummy {
    val myOrders = MyOrders(
        1,
        R.drawable.burger,
        "Hamburguesa de Pollo",
        14.250
    )

    val myOrdersList = listOf(
        myOrders,
        myOrders.copy(
            id = 2,
            ordersImageId = R.drawable.burger2,
            name = "Hamburguesa de carne",
            price = 13.450
        ),
        myOrders.copy(
            id = 3,
            ordersImageId = R.drawable.pizza,
            name = "Pizza de pollo",
            price = 16.250
        )
    )
}