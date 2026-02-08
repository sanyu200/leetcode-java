-- Problem: Combine Two Tables (LeetCode)
-- Pattern: LEFT JOIN
-- Time Complexity: O(n)
-- Space Complexity: O(1)

SELECT 
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
    ON p.personId = a.personId;
