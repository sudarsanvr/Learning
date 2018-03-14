#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
	@tag
	Feature: Title of your feature
  I want to use this template for my feature file
    
  Background: User is logging In
  		Given User is on the login screen

  @Smoketest

  Scenario: Title of your scenario
    Then user checks the title of the page

  @Regressiontest
  Scenario: Guru99 Successful login
    When Login page is displayed
    Then user enters the username and password
    Then user clicks on Login button
    And user is on Home page

  @Smoketest
  Scenario Outline: Guru99 Successful login
    When Login page is displayed
    Then user enters the "<username>" and "<password>"
    Then user clicks on Login button
    And user is on Home page
    Then user clicks on Add Customer Link
    And user enters customer details "<Customer Name>" and "<Gender>" and "<Date of Birth>" and "<City>" and "<State>" and "<PIN>"

    Examples: 
      | username   | password | Customer Name | Gender | Date of Birth | City       | State | PIN    |
      | mngr120674 | EdabeqE  | sunder        | m      | 13/05/1986    | Chennai    | TN    | 600125 |
      | mngr120674 | EdabeqE  | rajan         | f      | 14/06/1989    | coimbatore | TN    | 631099 |

  @Smoketest @Regressiontest
  Scenario: Guru99 Successful login using DataTables
    When Login page is displayed
    Then user enters username and password
      | mngr120674 | EdabeqE |
    Then user clicks on Login button
    And user is on Home page
    Then user clicks on Add Customer Link
    And user enters customer details Customer Name and Gender and Date of Birth and City and State and PIN
      | max | f | 13/05/1856 | Coimbatore | Tamil Nadu | 600125 |

  @Smoketest
  Scenario: Guru99 Successful login using DataTables
    When Login page is displayed
    Then user enters their username and password
      | username   | password |
      | mngr120674 | EdabeqE  |
    Then user clicks on Login button
    And user is on Home page
    Then user clicks on Add Customer Link
    And user enters multiple customer details Customer Name and Gender and Date of Birth and City and State and PIN
      | Customername | Gender | DateofBirth | City       | State      | PIN    |
      | max          | f      | 13/05/1856  | Coimbatore | Tamil Nadu | 621050 |
      | Tom          | m      | 14/05/1856  | Chennai    | Tamil Nadu | 600125 |
      | jill         | f      | 15/05/1856  | Namakkal   | Tamil Nadu | 630123 |

      