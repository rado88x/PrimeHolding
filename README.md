# PrimeHolding

# BrothersInTheBar  

Problem  

Three brothers walk into a bar. All the beverages are placed in one line at the long bar table. The size of each glass is represented in an array of integers, glasses.

The brothers will drink a round if they can find 3 consecutive glasses of the same size. The barman removes the empty glasses from the table immediately after each round.

Find the maximum number of rounds the three brothers can drink.

Example

![alt text](https://github.com/rado88x/PrimeHolding/blob/master/brothersInTheBar.png)

For glasses = [1, 1, 2, 3, 3, 3, 2, 2, 1, 1], the output should be brothersInTheBar(glasses) = 3.

The brothers can start with a round of size 3, then after the glasses are cleared, a round of size 2 can be formed, followed by a round of size 1. One glass will be left at the table.

Solution:

LinkedList is appropriate structure because adding and removing elements does not require to shifting elements.  

We don't care in this scenario about the index of elements so we are traversing the list only one time.  

Method brothersInTheBar is static so no need of creating object to access it. It accept array of integers representing the glasses volumes.  

Adding all elements to LinkedList.  

Loading glassTwoBefore and glassBefore to have a set of 3 for comparing. Variable "glass" represent the glass we are checking in this moment.  

While will work until there are more than 3 glasses on the bar table or iterator has gone to last glass. On every step we check for 3 same glasses. If there are 3 same glasses counter (result) is increased, glasses are removed and iterator is repositioned. After iterator is repositioned we load again glassTwoBefore and glassBefore to have them for comparing.  



# MarketStore

Assignment

A market store offers to their clients three different types of discount cards: bronze, silver and gold. Each card stores information about its owner, the turnover for the previous month and the initial discount rate. With each card you can calculate the discount of the current purchase. In general this is done using the formula: value_of_purchase * discount_rate.

The bronze card comes with no discount rate if the turnover for the previous month is below $100. If it is between $100 and $300, the discount rate is 1%. And if it is above $300, the rate is 2.5%.

The silver card comes with an initial discount rate of 2%. In case, the turnover is over $300, the rate is 3.5%.

The gold card comes with an initial discount rate of 2%. The discount rate grows 1% for each $100 from the turnover, capping at 10%.

Your task is:

to write an object-oriented model of this market store system;
to create a class called PayDesk containing static method(s) that output the discount rate, the discount and the total purchase value;
in your application entry point:
create instances with sample data as shown in Example outputs section;
invoke method(s) of the PayDesk class to print the required information.


Example outputs
Bronze:
a. Mock data: turnover $0, purchase value $150;
b. Output:

Purchase value: $150.00

Discount rate: 0.0%

Discount: $0.00

Total: $150.00

Silver:
a. Mock data: turnover $600, purchase value $850;
b. Output:

Purchase value: $850.00

Discount rate: 3.5%

Discount: $29.75

Total: $820.25

Gold:
a. Mock data: turnover $1500, purchase value $1300;
b. Output:

Purchase value: $1300.00

Discount rate: 10.0%

Discount: $130.00

Total: $1170.00


Technologies
You must provide the solution as a console application written in Java.

Grading
Modelling the store following the object-oriented principles - 40%
Create PayDesk class and its parts - 22%
Application Entry Point - 8%
Code Quality - 30%

Deliverables
1. Application source code 
2. Explanation: a document that describes how the application is supposed to be started and how it works.

You must submit a link with your deliverables. The link can be either for cloud storage (Google Drive, OneDrive, pCloud, etc.) OR source control hosting (GitHub, GitLab, Bitbucket, etc.).

===============================================================================

Solution explanation : 
 
LinkedList is appropriate structure because adding and removing elements does not require to shifting elements.  
We don't care in this scenario about the index of elements so we are traversing the list only one time.  
Method brothersInTheBar is static so no need of creating object to access it. It accept array of integers representing the glasses volumes.  

Adding all elements to LinkedList.  

Loading glassTwoBefore and glassBefore to have a set of 3 for comparing. Variable "glass" represent the glass we are checking in this moment.  

While will work until there are more than 3 glasses on the bar table or iterator has gone to last glass. On every step we check for 3 same glasses. If there are 3 same glasses counter (result) is increased, glasses are removed and iterator is repositioned. After iterator is repositioned we load again glassTwoBefore and glassBefore to have them for comparing.  
