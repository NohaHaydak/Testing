## TASK:
Return the customers(customer_id, customer_name, categories_count, categories_list, totalspent) who bought items from more than one category.

---

## SCHEME of the provided data base was as shown below:
---Tables
        |
        |--->categories
        |             |-->id
        |             |-->name
        |--->customers
        |            |-->id
        |            |-->name
        |            |-->email
        |            |-->created_at
        |--->order_items
        |              |-->id
        |              |-->order_id
        |              |-->product_id
        |              |-->quantity
        |              |-->unit_price
        |--->orders
        |          |-->id
        |          |-->customer_id
        |          |-->order_date
        |          |-->status
        |--->products
        |           |-->id
        |           |-->sku
        |           |-->name
        |           |-->category_id
        |           |-->suppkier_id
        |           |-->price
        |           |-->stock
        |--->suppliers
        |            |-->id
        |            |-->name
        |            |-->category
                  
---
  
## 1. categories
| id | name           |
|----|----------------|
| 1  | Electronics    |
| 2  | Grocery        |
| 3  | Home & Kitchen |

---

## 2. customers
| id | name             | email                | created_at           |
|----|------------------|----------------------|----------------------|
| 1  | Fatima Al-Harbi  | fatima@example.com   | 2025-09-13 00:53:30 |
| 2  | Omar Khaled      | omar@example.com     | 2025-09-13 00:53:30 |
| 3  | Lina Saeed       | lina@example.com     | 2025-09-13 00:53:30 |
| 4  | Mohammad Mousa   | mohammad@example.com | 2025-09-13 00:53:30 |
| 5  | Yousef Ali       | yousef@example.com   | 2025-09-13 00:53:30 |
| 6  | Aisha Nasser     | aisha@example.com    | 2025-09-13 00:53:30 |

---

## 3. order_items
| id | order_id | product_id | quantity | unit_price |
|----|----------|------------|----------|------------|
| 1  | 1        | 1          | 1        | 699.00     |
| 2  | 2        | 5          | 2        | 12.50      |
| 3  | 3        | 2          | 1        | 149.00     |
| 4  | 4        | 7          | 1        | 22.00      |
| 5  | 5        | 8          | 4        | 6.90       |
| 6  | 5        | 6          | 1        | 8.75       |
| 7  | 6        | 3          | 1        | 199.00     |
| 8  | 6        | 4          | 1        | 89.00      |
| 9  | 7        | 9          | 2        | 25.00      |
| 10 | 7        | 10         | 1        | 45.00      |
| 11 | 8        | 2          | 1        | 149.00     |
| 12 | 9        | 5          | 3        | 12.50      |
| 13 | 9        | 7          | 1        | 22.00      |
| 14 | 10       | 8          | 2        | 6.90       |

---

## 4. orders
| id | customer_id | order_date           | status    |
|----|-------------|----------------------|-----------|
| 1  | 1           | 2025-08-01 10:15:00 | completed |
| 2  | 1           | 2025-08-05 16:30:00 | completed |
| 3  | 2           | 2025-08-03 09:10:00 | completed |
| 4  | 2           | 2025-08-07 11:45:00 | completed |
| 5  | 3           | 2025-08-10 14:05:00 | completed |
| 6  | 4           | 2025-08-11 12:00:00 | completed |
| 7  | 5           | 2025-08-12 18:20:00 | completed |
| 8  | 1           | 2025-08-15 09:00:00 | completed |
| 9  | 6           | 2025-08-16 10:00:00 | completed |
| 10 | 2           | 2025-08-20 13:00:00 | completed |

---

## 5. products
| id | sku   | name                 | category_id | supplier_id | price  | stock |
|----|-------|----------------------|-------------|-------------|--------|-------|
| 1  | P1001 | Smartphone X         | 1           | 1           | 699.00 | 50    |
| 2  | P1002 | Wireless Headphones  | 1           | 1           | 149.00 | 120   |
| 3  | P1003 | Smartwatch Z         | 1           | 1           | 199.00 | 75    |
| 4  | P1004 | Bluetooth Speaker    | 1           | 1           | 89.00  | 65    |
| 5  | P2001 | Olive Oil 1L         | 2           | 2           | 12.50  | 200   |
| 6  | P2002 | Organic Honey 450g   | 2           | 2           | 8.75   | 80    |
| 7  | P2003 | Rice 5kg             | 2           | 2           | 22.00  | 60    |
| 8  | P3001 | Ceramic Mug          | 3           | 3           | 6.90   | 300   |
| 9  | P3002 | Dinner Plate Set     | 3           | 3           | 45.00  | 40    |
| 10 | P3003 | Throw Pillow         | 3           | 3           | 25.00  | 90    |

---

## 6. suppliers
| id | name             | country |
|----|------------------|---------|
| 1  | ACME Electronics | China   |
| 2  | Fresh Foods Co.  | Spain   |
| 3  | HomeStuff Ltd.   | Turkey  |

---

## SQL Query Results

| customer_id | customer_name | categories_count | categories_list                | totalspent |
|-------------|---------------|------------------|--------------------------------|------------|
| 1           | Ahmed Ali     | 2                | Electronics, Furniture         | 1250.00    |
| 2           | Sara Mohamed  | 3                | Clothing, Electronics, Grocery | 980.50     |
| 3           | Mahmoud Nabil | 2                | Grocery, Toys                  | 410.00     |

  

     
   
