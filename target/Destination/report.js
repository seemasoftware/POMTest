$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/login.feature");
formatter.feature({
  "name": "As a user i can login successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.MyStepdefs.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on popup button",
  "keyword": "When "
});
formatter.match({
  "location": "Test.MyStepdefs.userClickOnPopupButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get pagetitle",
  "keyword": "And "
});
formatter.match({
  "location": "Test.MyStepdefs.getPagetitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.MyStepdefs.userShouldClosePageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
});