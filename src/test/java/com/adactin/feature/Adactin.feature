Feature: Hotel Booking  Functionality
 
Scenario: User want to login the application
  Given   User launch the adactin application
  When    User enter the valid username
  And     User enter the valid password
  And     User click on Login 
  Then    User validate the username and password
  
  
  Scenario: User want to search hotel
    When    User enter the Location
    And     User enter the Hotels
    And     User enter the Room type
    And     User enter the Number of Rooms
    And     User clear the Check In Date
    And     User enter the Check In Date
    And     User clear the Check Out Date
    And     User enter the check Out Date
    And     User enter the Adults per Room
    And     User enter the Children per Room
    Then    User click search
    
    
    Scenario: User need to select Hotel
      When    User click on Radio Button
      Then    User click on Continue Button
      
    Scenario:  User need to enter his personal details
      When     User enter his/her first name
      And      User enter his/her last name
      And      User enter his/her address 
      And      User enter his/her credit card number
      And      User enter his/her credit card type
      And      User enter month
      And      User enter year
      And      User enter the cvv number
      Then     User click the book now button   
      