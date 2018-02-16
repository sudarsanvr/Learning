$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Login.Feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 56,
  "name": "Guru99 Successful login using DataTables",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login-using-datatables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "user is on the login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "mngr115134",
        "vEtYtYt"
      ],
      "line": 60
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "user enters customer details Customer Name and Gender and Date of Birth and City and State and PIN",
  "rows": [
    {
      "cells": [
        "max",
        "f",
        "13/05/1856",
        "Coimbatore",
        "Tamil Nadu",
        "600125"
      ],
      "line": 65
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_login_screen()"
});
formatter.result({
  "duration": 14638865160,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "duration": 14724899,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1174215583,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 2139555823,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 23462007,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Add_Customer_Link()"
});
formatter.result({
  "duration": 67834110,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(DataTable)"
});
formatter.result({
  "duration": 6810435512,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "duration": 1134158710,
  "status": "passed"
});
});