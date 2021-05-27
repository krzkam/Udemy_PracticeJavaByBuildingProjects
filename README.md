Practice Java by Building Projects Course at Udemy.com

Project 1
Email Application

application should do the following:
1. Generate an email with the following syntax: firstname.lastname@department.company.com
2. Determine the department (sales, development, accounting), if none leave blank
3. Generate a random String for a password
4. Have set methods to change the password, set the mailbox capacity, and define an alternate email address
5. Have get methods to display the name, email, and mailbox capacity

Project 2
Student Database Application

application should do the following:
1. Ask the user how many new students will be added to the database
2. The user should be prompted to enter the name and year for each student
3. The student should have a 5-digit unique ID, with the first number being their grade level
4. A student can enroll in the following courses:
- History 101 
- Mathematics 101
- English 101
- Chemistry 101
- Computer Science 101
5. Each course costs $600 to enroll
6. The student should be able to view their balance and pay the tuition
7. To see the status of the student, we should see their name, ID, courses enrolled, and balance

Project 3
Bank Application to handle new bank account requests.
1. Read a .csv file of names, social security numbers, account type, and typical deposit
2. Use a proper data structure to hold all these accounts
3. Both savings and checking accounts share the following properties:
- deposit()
- withdraw()
- transfer()
- showInfo()

11-Digit Account Number (generated with the following process: 1 or depending on Savings or Checking, last two digist of SSN, uniqe 5-digit number, and random 3-digit number)
4. Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
5. Both accounts will use an interface that determines a base interest rate.

Savings accounts wil use .25 points less than a base rate

Checking accounts will use 15% of the base rate
6. The ShowInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account.
