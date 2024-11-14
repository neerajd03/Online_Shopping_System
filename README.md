# Online_Shopping_System
This is a simple console-based Online Shopping System implemented in Java. The system allows users to perform various operations related to an online shopping cart, such as adding, changing, deleting items, and calculating the total cost.
## Features
- Add Items to Cart: Allows the user to add products with details like product ID, name, category, and price to the shopping cart.
- Change Cart Items: Modify details (name, ID, category, price) of an existing product in the cart.
- Show Product Details: Display details of a product by its name.
- View All Cart Items: Show all items currently in the shopping cart.
- Delete Items from Cart: Remove a product from the cart by specifying its name.
- Calculate Total Cost: Calculate the total cost of all items in the cart.
## Structure
- The application follows a Model-View-Controller (MVC) architecture:
-- Model: Represents the Usermodel class, which holds the product's details like ID, name, category, and price.
-- View: The Userview class handles the user interface (UI) where users can interact with the system by choosing options.
-- Controller: The Usercontroller class manages the logic behind processing user input, adding/removing products, and calculating totals.
## Technologies Used
- Java 8 or higher
- Scanner class for user input
- Console-based UI
## How to Run
- Clone this repository to your local machine.
- Navigate to the directory containing the *Userview.java*, *Usercontroller.java*, and *Usermodel.java* files.
- Compile the Java files:
``` bash
javac Userview.java Usercontroller.java Usermodel.java
```
- Run the application:
``` bash
java Userview
```
## Usage
- Upon running the application, you will be prompted to select from the following options:
  -- Add a product to the cart.
  -- Change the details of an existing product in the cart.
  -- View product details by name.
  -- View all items in the cart.
  -- Delete a product from the cart.
  -- Calculate the total cost of all items in the cart.
  -- Exit the system.
