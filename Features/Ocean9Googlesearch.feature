 Feature: Perform Google search
 
 Scenario Outline: simple Search
 
 Given i am o google home page
 When i enter search "<term>"
 And i click on google search button
 Then i receive related search results
 
 Examples:
 |term             |
 |Quality Assurance|
 |Software Testing |  