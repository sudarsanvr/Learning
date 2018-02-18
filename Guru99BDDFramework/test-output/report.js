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
  "line": 69,
  "name": "Guru99 Successful login using DataTables",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login-using-datatables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 68,
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "line": 70,
  "name": "user is on the login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 71,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 72,
  "name": "user enters their username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 73
    },
    {
      "cells": [
        "mngr115134",
        "vEtYtYt"
      ],
      "line": 74
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "user enters multiple customer details Customer Name and Gender and Date of Birth and City and State and PIN",
  "rows": [
    {
      "cells": [
        "Customername",
        "Gender",
        "DateofBirth",
        "City",
        "State",
        "PIN"
      ],
      "line": 79
    },
    {
      "cells": [
        "max",
        "f",
        "13/05/1856",
        "Coimbatore",
        "Tamil Nadu",
        "621050"
      ],
      "line": 80
    },
    {
      "cells": [
        "Tom",
        "m",
        "14/05/1856",
        "Chennai",
        "Tamil Nadu",
        "600125"
      ],
      "line": 81
    },
    {
      "cells": [
        "jill",
        "f",
        "15/05/1856",
        "Namakkal",
        "Tamil Nadu",
        "630123"
      ],
      "line": 82
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_login_screen()"
});
formatter.result({
  "duration": 55173209250,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "duration": 18780700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_their_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2290456340,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 2424288058,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 18795570,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Add_Customer_Link()"
});
formatter.result({
  "duration": 168820694,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_multiple_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(DataTable)"
});
formatter.result({
  "duration": 7875163309,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "duration": 3815747321,
  "status": "passed"
});
});