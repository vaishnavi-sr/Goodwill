# Goodwill
Individual project

Online Donation Curb Side Pickup

Problems :

 As of today, if any one wants to donate any items, they need to visit the store/library/dropbox and donate.

Solution : 

This project is for online donation of books,cloths,furniture,toys,home appliances,etc.,
Admin will create donation events based on the category (books,cloths) for different weekend days.
Based on the donation events, End user will register the items which he likes to donate via curb side pickup.
Admin will pickup donations form end user from curb side as per the donation event dates.
Once donatin are collected, Admin will post the collected donations for online sale and the amount will be donated goods.

Technologies Used:
-Java & java Script
- Spring Web MVC for web application
- Spring Data JPA & Hibernate for Data Access layer
- Spring Security for Authentication (Login and Logout)
- Bootstrap (using Webjars) for responsive UI with HTML5 and CSS
- MySQL database server to store user information 




Feature 1 : Login Admin Form  
Admin ---> Create/Update/Delete Donation Events  (Donation Event Name, Description, Location/Address, Date/Timings, Category,Contact Person Name & Mobile) 
      ----> Create/Update/Delete Donation Categories -- like Book, Cloth,etc,
      -----> Based on the category, display Form.
      ------> Registered Event donation Users along with address
      ------> Show all Donated items based on category and price

Fature 2 :  End User Donation Registration Form
           -- Search Donation Events based on the category
           -- List Events based on category 	(same catagory can have more than 2 events on different weekends)
           -- Fill the form of category related donation details registration.


Feature 3: End User 
           -- show all donated items based on categroy and price.
           -- Buy/Payment 
           --Delivery Details

Feature 4 : Donation Amount Distribution
 
