--
-- Consult by order
--


SELECT BirdOrder.name_order, COUNT(*) AS Cantidad
FROM BirdOrder INNER JOIN Bird 
ON BirdOrder.ID_Bird = Bird.ID_Bird
GROUP BY BirdOrder.name_order
ORDER BY Cantidad DESC;


--
-- Consult by suborder amount of birds
--

SELECT Suborder.name_suborder, COUNT(*) AS Cantidad
FROM Suborder
INNER JOIN BirdOrder ON Suborder.ID_Order = BirdOrder.ID_Order
INNER JOIN Bird ON Bird.ID_Bird = BirdOrder.ID_Bird
GROUP BY Suborder.name_suborder
ORDER BY Cantidad DESC;


--
-- Consult by family amount of birds
-- 

SELECT Family.name_family, COUNT(*) AS Cantidad
FROM Family 
INNER JOIN Suborder ON Suborder.ID_Suborder = Family.ID_Suborder
INNER JOIN BirdOrder ON Suborder.ID_Order = BirdOrder.ID_Order
INNER JOIN Bird ON BirdOrder.ID_Bird = Bird.ID_Bird
GROUP BY Family.name_family
ORDER BY Cantidad DESC;


-- 
-- Consult by gender amount of birds
--

SELECT Gender.name_gender, COUNT(*) AS Cantidad
FROM Gender 
INNER JOIN Family ON Gender.ID_Family = Family.ID_Family
INNER JOIN Suborder ON Suborder.ID_Suborder = Family.ID_Suborder
INNER JOIN BirdOrder ON Suborder.ID_Order = BirdOrder.ID_Order
INNER JOIN Bird ON BirdOrder.ID_Bird = Bird.ID_Bird
GROUP BY Gender.name_gender
ORDER BY Cantidad DESC;

-- 
-- Consult by specie amount of birds
--

SELECT Specie.name_specie, COUNT(*) AS Cantidad
FROM Specie
INNER JOIN Gender ON Specie.ID_Gender = Gender.ID_Gender
INNER JOIN Family ON Gender.ID_Family = Family.ID_Family
INNER JOIN Suborder ON Suborder.ID_Suborder = Family.ID_Suborder
INNER JOIN BirdOrder ON Suborder.ID_Order = BirdOrder.ID_Order
INNER JOIN Bird ON BirdOrder.ID_Bird = Bird.ID_Bird
GROUP BY Specie.name_specie
ORDER BY Cantidad DESC;


-- 
-- Consult by zone, amount of birds
-- ------------------------------------------Falta

SELECT District.name_district , COUNT(*) AS Cantidad
FROM District
INNER JOIN 
INNER JOIN 
GROUP BY 
ORDER BY Cantidad DESC;

