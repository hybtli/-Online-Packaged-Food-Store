# Online-Packaged-Food-Store


Assume that there is an online store that sells packaged food, which are tuna, corn, instant
noodles and pudding. Tuna and corn are sold in cans and the others are sold in packets. The 
store ships the products in cargo packets after getting orders.
The information to be written on food product packages is given in the following table. The 
properties are to be written in bold. Each product should also have an **expiration date** on its 
package.



![image](https://user-images.githubusercontent.com/102618972/163729148-31a44da5-cae5-48d5-8a2d-5cb9520dfd31.png)


1. For each different category of foods, create **30 items** that have the above field values. 
The difference between each item in a given food category should be the expiration 
date. The expiration dates are required to be between **July 2022** and **December 2024** 
and should increase monthly. This means that the expiration date of the first tuna can 
is July 2022; the expiration date of the next tuna can is August 2022 and the expiration 
date of the 30th tuna can is December 2024. Similar approach should hold for corn 
cans, pudding packets and instant noodle packets as well. Therefore, there will be 120 
packaged food products created in total.

2. For each different food category, create **a pile of packaged foods**. In the pile, 
packages having the **earliest** expiration dates are at the top of the pile. The package 
put onto the pile last will be first to be out. 

3. Create order objects which hold ID, order date and names of 3 different food 
categories. Please create an array of Strings for the food categories. In order to do so, 
read the **orders.csv** file, which has the following format:
            
            order_id, order_date, food category_1, food category_2, food category_3

4. Create **a waiting line of orders**. The order that is put first in the waiting line, will be 
the one to come out first. At the front of the waiting line, there will be the order having 
the **earliest** order date.

5. Create cargo packets by processing the orders. The ID and the process date of the 
cargo packet will be equal to the ID and the order date of the corresponding order, 
respectively. When you process an order, for each food category, find the associated 
pile and pop the food product at the top. Then place this product into a cargo packet. 
There should be a **list** to hold these packaged products in cargo packet objects.

6. Create **a list of cargo packets**. The ID of the packet shows the order of the packet in 
the list. For example, the cargo packet with ID 1, will be on the index 0 (zero) on the 
list. 

7. Print on the console, the **contents** of 
            
            ● four different piles of food packages (before and after processing the orders)
            ● the waiting line of orders 
            ● the list of cargo packets
            
8. Print the expiration dates of the packaged products of the cargo packet with ID 25.

9. Remove the cargo packet with ID 20 from the cargo packets list and print the contents 
of the list again.

**Note:** A visualization of the piles, waiting line and cargo list are given below as an image which 
may help to understand the concept of the system.

![image](https://user-images.githubusercontent.com/102618972/163729336-105d12cc-3ad8-49f0-8e1e-8373001e215b.png)

