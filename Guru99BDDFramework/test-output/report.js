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
formatter.background({
  "line": 23,
  "name": "User is logging In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User is on the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 28,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user checks the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_checks_the_title_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 23,
  "name": "User is logging In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User is on the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "Guru99 Successful login",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Regressiontest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user enters the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 39,
  "name": "Guru99 Successful login",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 38,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "user enters customer details \"\u003cCustomer Name\u003e\" and \"\u003cGender\u003e\" and \"\u003cDate of Birth\u003e\" and \"\u003cCity\u003e\" and \"\u003cState\u003e\" and \"\u003cPIN\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 47,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Customer Name",
        "Gender",
        "Date of Birth",
        "City",
        "State",
        "PIN"
      ],
      "line": 48,
      "id": "title-of-your-feature;guru99-successful-login;;1"
    },
    {
      "cells": [
        "mngr120674",
        "EdabeqE",
        "sunder",
        "m",
        "13/05/1986",
        "Chennai",
        "TN",
        "600125"
      ],
      "line": 49,
      "id": "title-of-your-feature;guru99-successful-login;;2"
    },
    {
      "cells": [
        "mngr120674",
        "EdabeqE",
        "rajan",
        "f",
        "14/06/1989",
        "coimbatore",
        "TN",
        "631099"
      ],
      "line": 50,
      "id": "title-of-your-feature;guru99-successful-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 23,
  "name": "User is logging In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User is on the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 49,
  "name": "Guru99 Successful login",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 38,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user enters the \"mngr120674\" and \"EdabeqE\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "user enters customer details \"sunder\" and \"m\" and \"13/05/1986\" and \"Chennai\" and \"TN\" and \"600125\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr120674",
      "offset": 17
    },
    {
      "val": "EdabeqE",
      "offset": 34
    }
  ],
  "location": "LoginStepDefinition.user_enters_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Add_Customer_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sunder",
      "offset": 30
    },
    {
      "val": "m",
      "offset": 43
    },
    {
      "val": "13/05/1986",
      "offset": 51
    },
    {
      "val": "Chennai",
      "offset": 68
    },
    {
      "val": "TN",
      "offset": 82
    },
    {
      "val": "600125",
      "offset": 91
    }
  ],
  "location": "LoginStepDefinition.user_enters_customer_details(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 23,
  "name": "User is logging In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User is on the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 50,
  "name": "Guru99 Successful login",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 38,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user enters the \"mngr120674\" and \"EdabeqE\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "user enters customer details \"rajan\" and \"f\" and \"14/06/1989\" and \"coimbatore\" and \"TN\" and \"631099\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr120674",
      "offset": 17
    },
    {
      "val": "EdabeqE",
      "offset": 34
    }
  ],
  "location": "LoginStepDefinition.user_enters_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Add_Customer_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "rajan",
      "offset": 30
    },
    {
      "val": "f",
      "offset": 42
    },
    {
      "val": "14/06/1989",
      "offset": 50
    },
    {
      "val": "coimbatore",
      "offset": 67
    },
    {
      "val": "TN",
      "offset": 84
    },
    {
      "val": "631099",
      "offset": 93
    }
  ],
  "location": "LoginStepDefinition.user_enters_customer_details(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 23,
  "name": "User is logging In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User is on the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 53,
  "name": "Guru99 Successful login using DataTables",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login-using-datatables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@Smoketest"
    },
    {
      "line": 52,
      "name": "@Regressiontest"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "mngr120674",
        "EdabeqE"
      ],
      "line": 56
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
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
      "line": 61
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Add_Customer_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 23,
  "name": "User is logging In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User is on the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_the_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 64,
  "name": "Guru99 Successful login using DataTables",
  "description": "",
  "id": "title-of-your-feature;guru99-successful-login-using-datatables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 63,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 65,
  "name": "Login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "user enters their username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 67
    },
    {
      "cells": [
        "mngr120674",
        "EdabeqE"
      ],
      "line": 68
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "user is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "user clicks on Add Customer Link",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
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
      "line": 73
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
      "line": 74
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
      "line": 75
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
      "line": 76
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_their_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Add_Customer_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_multiple_customer_details_Customer_Name_and_Gender_and_Date_of_Birth_and_City_and_State_and_PIN(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});