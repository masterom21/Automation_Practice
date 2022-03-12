$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Create Account Test",
  "description": "\r\nAs a user i should able to create account successful\r\n\r\n//@regression",
  "id": "create-account-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 11210394300,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "As a user I want to create new account with valid credentials",
  "description": "",
  "id": "create-account-test;as-a-user-i-want-to-create-new-account-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User clicks on the sign in button from the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters an email in the email address field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on create an account tab",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill all mandatory fields",
  "rows": [
    {
      "cells": [
        "Harry",
        "Potter",
        "abc12745",
        "123 Abc Street",
        "Dallas",
        "Texas",
        "12345",
        "United States",
        "01234567890"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on register",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verify my account text \"MY ACCOUNT\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify user can see his name on top right \"Harry Potter\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepdefs.userClicksOnTheSignInButtonFromTheHomepage()"
});
formatter.result({
  "duration": 1989179500,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepdefs.entersAnEmailInTheEmailAddressField()"
});
formatter.result({
  "duration": 165983100,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepdefs.clicksOnCreateAnAccountTab()"
});
formatter.result({
  "duration": 180894300,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepdefs.fillAllMandatoryFields(DataTable)"
});
formatter.result({
  "duration": 3432302100,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepdefs.clickOnRegister()"
});
formatter.result({
  "duration": 1938631800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY ACCOUNT",
      "offset": 24
    }
  ],
  "location": "AccountStepdefs.verifyMyAccountText(String)"
});
formatter.result({
  "duration": 56621900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 43
    }
  ],
  "location": "AccountStepdefs.verifyUserCanSeeHisNameOnTopRight(String)"
});
formatter.result({
  "duration": 83290700,
  "status": "passed"
});
formatter.after({
  "duration": 1686140600,
  "status": "passed"
});
formatter.uri("FindStore.feature");
formatter.feature({
  "line": 2,
  "name": "Find Store On Map",
  "description": "As a user I want to browse store on map and take screenshot for future reference",
  "id": "find-store-on-map",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 6273355300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingCartStepdefs.iAmInHomePage()"
});
formatter.result({
  "duration": 97300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify user able to browse the store on map",
  "description": "",
  "id": "find-store-on-map;verify-user-able-to-browse-the-store-on-map",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I select On \"Our stores\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on OK button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click On zoomOut",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I take screenshot",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Our stores",
      "offset": 13
    }
  ],
  "location": "OurStoreStepdefs.iSelectOn(String)"
});
formatter.result({
  "duration": 4215739400,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreStepdefs.iClickOnOKButton()"
});
formatter.result({
  "duration": 136239600,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreStepdefs.iClickOnZoomOut()"
});
formatter.result({
  "duration": 185334400,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreStepdefs.iTakeScreenshot()"
});
formatter.result({
  "duration": 714805400,
  "status": "passed"
});
formatter.after({
  "duration": 1325020400,
  "status": "passed"
});
});