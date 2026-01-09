# TP2 – Collections & Streams and Generics

## Introduction

This repository contains the solutions of **TP2**.
Each exercise includes:
- a description of the problem,
- the proposed solution,
- screenshots showing the execution of the program.

---
## I. Collections & Streams

## Part 1 — Lists (Product Management)

###  Problem Description

We want to create a simple Java application to manipulate a list of objects of type `Product`.
Each product is characterized by an id, a name, and a price.

The application must allow the user to:
- Add products to a list
- Delete a product by its index
- Display all products
- Modify a product by its index
- Search for a product by its name entered by the user
- 
---

###  Proposed Solution

The solution consists of the following steps:

1. Create a `Product` class containing the attributes:
   - `id` (long)
   - `name` (String)
   - `price` (double)
2. Create a class `ProductManagementApp` containing the `main` method.
3. Inside the `main` method:
   - Create an `ArrayList<Product>` to store products.
   - Add several products to the list.
   - Remove a product using its index.
   - Modify a product’s information using its index.
   - Display the list of products using a loop or `forEach`.
   - Ask the user to enter a product name and search for it using Java Streams.


###  Program Execution

<img width="725" height="581" alt="image" src="https://github.com/user-attachments/assets/90825036-4bf5-4b56-bbc5-15cd0dc9696c" />


## Part 2 — Maps (Student Grades Management)

###  Problem Description

We want to manage student grades using a `HashMap`.
Each entry contains:
- A **key**: the student’s name (String)
- A **value**: the student’s grade (double)

The application must allow:
- Inserting student grades
- Increasing a student’s grade
- Deleting a student’s grade
- Displaying the size of the map
- Calculating the average, maximum, and minimum grades
- Checking if there is a grade equal to 20
- Displaying the map after each operation using `forEach` and a lambda expression

---

###  Proposed Solution

The solution consists of:

1. Creating a `HashMap<String, Double>` to store student grades.
2. Adding several students and their grades.
3. Updating (increasing) a student’s grade.
4. Removing a student from the map.
5. Displaying the size of the map using `size()`.
6. Using Streams to compute:
   - The average grade
   - The maximum grade
   - The minimum grade
7. Checking if a grade equal to 20 exists using `anyMatch`.
8. Displaying the map after each operation using:
   ```java
   map.forEach((name, grade) -> System.out.println(name + " : " + grade));

###  Program Execution
<img width="559" height="567" alt="image" src="https://github.com/user-attachments/assets/304cca29-484e-4e00-a794-f91746c97693" />


## Part 3 — Sets (Groups A and B)

###  Problem Description

We want to manipulate two groups of students using the Java `HashSet` collection.
Each group contains a set of student names, and duplicate names are not allowed.

The application must:
- Store the names of students in group A and group B
- Display the **intersection** of the two groups (students belonging to both groups)
- Display the **union** of the two groups (all students from both groups without duplication)

The goal is to practice the use of **Set collections** and their specific operations.

---

###  Proposed Solution

The solution consists of the following steps:

1. Create two `HashSet<String>` objects named:
   - `groupA`
   - `groupB`
2. Add student names to each `HashSet`.
3. To display the **intersection**:
   - Create a copy of one set
   - Use the method `retainAll()` to keep only common elements
4. To display the **union**:
   - Create a copy of one set
   - Use the method `addAll()` to combine both sets
5. Display the resulting sets.

---

###  Program Execution

<img width="576" height="236" alt="image" src="https://github.com/user-attachments/assets/2d1ff192-51cb-4df7-8758-8d8dcd619617" />



---
## II. Generics

## Part 1 — GenericStorage (Generic Class)

###  Problem Description

We want to create a **generic class** called `GenericStorage` that is capable of storing elements of **any type** using Java Generics.

The class must:
- Store elements in a collection of type `List`
- Allow adding, removing, and retrieving elements
- Allow checking the current size of the collection

The objective is to demonstrate how **Generics** make code reusable, flexible, and type-safe.

The implementation must be tested using different data types such as:
- Integer
- String
- Double

---

###  Proposed Solution

The solution consists of the following steps:

1. Create a generic class `GenericStorage<T>`.
2. Declare an attribute `elements` of type `List<T>` to store the elements.
3. Implement the following methods:
   - `addElement(T o)` to add an element to the list.
   - `removeElement(int index)` to remove an element by its index.
   - `getElement(int index)` to retrieve an element at a given position.
   - `getSize()` to return the number of elements in the list.
4. Add index validation to avoid runtime errors.
5. Create an `Application` class to test the generic class.
6. Use the `GenericStorage` class with different types (Integer, String, Double).
7. Perform addition, retrieval, deletion, and size verification operations.

---

###  Program Execution
<img width="586" height="231" alt="image" src="https://github.com/user-attachments/assets/4fbaff65-404b-48f4-b1ee-85afbfbf455a" />




---

## Part 2 — Product Management Using Generics and Interfaces

###  Problem Description

The objective of this task is to use **Java Generics** with a collection of objects of type `Product`.

We want to design a product management system that:
- Uses a generic interface to define business operations
- Applies object-oriented principles such as abstraction and encapsulation
- Manages products using a collection (`List`)
- Allows user interaction through a menu-driven program

Each product contains:
- id
- name
- brand
- price
- description
- number in stock

---

###  Proposed Solution

The solution is organized as follows:

1. Create a `Product` class with the required attributes.
2. Create a **generic interface** `IMetier<T>` that declares the following methods:
   - `add(T o)` to add an object to the list
   - `getAll()` to return all objects as a list
   - `findById(long id)` to search for an object by its id
   - `delete(long id)` to delete an object by its id
3. Implement this interface in a class `MetierProduitImpl`.
4. Use an `ArrayList` to store product objects.
5. Create an `Application` class containing the `main` method.
6. Implement a menu using a `while` loop that allows the user to:
   - Display the list of products
   - Search for a product by its id
   - Add a new product
   - Delete a product by id
   - Exit the program
7. Use the `Scanner` class to manage user input.

---

###  Program Execution
<img width="430" height="410" alt="image" src="https://github.com/user-attachments/assets/766566c3-85fe-4cf8-9238-4b84bc217f01" />
<img width="778" height="728" alt="image" src="https://github.com/user-attachments/assets/df404c68-5e5b-4bb2-ad06-b598784567b7" />
<img width="803" height="598" alt="image" src="https://github.com/user-attachments/assets/55042294-1f71-416f-969c-3d72e06e2d3b" />
<img width="833" height="400" alt="image" src="https://github.com/user-attachments/assets/c98fb8d4-bb2b-47ff-8e93-5b14e1d6a938" />




---

