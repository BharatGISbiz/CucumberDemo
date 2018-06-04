$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberDemo.feature");
formatter.feature({
  "line": 1,
  "name": "To run a demo Selenium With Cucumber",
  "description": "",
  "id": "to-run-a-demo-selenium-with-cucumber",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To verify the Login Functionality",
  "description": "",
  "id": "to-run-a-demo-selenium-with-cucumber;to-verify-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I Open the website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter Valid Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_Open_the_website()"
});
formatter.result({
  "duration": 15126049885,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_Valid_Username_and_Password()"
});
formatter.result({
  "duration": 190225120,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 2331700432,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_be_able_to_login()"
});
formatter.result({
  "duration": 454496271,
  "status": "passed"
});
});