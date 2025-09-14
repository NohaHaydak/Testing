SELECT c.id AS customer_id,
       c.name AS customer_name,
       COUNT(DISTINCT cat.id) AS categories_count,
       GROUP_CONCAT(DISTINCT cat.name ORDER BY cat.name) AS categories_list,
       SUM(oi.quantity * oi.unit_price) AS totalspent
FROM customers c
JOIN orders o ON c.id = o.customer_id
JOIN order_items oi ON o.id = oi.order_id
JOIN products p ON oi.product_id = p.id
JOIN categories cat ON p.category_id = cat.id
GROUP BY c.id, c.name
HAVING COUNT(DISTINCT cat.id) > 1;
