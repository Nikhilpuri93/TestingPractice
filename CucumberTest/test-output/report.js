$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookShoppingOrderConfirmation.feature");
formatter.feature({
  "line": 1,
  "name": "Login into the automation practice site and place an order for a book through shop option",
  "description": "",
  "id": "login-into-the-automation-practice-site-and-place-an-order-for-a-book-through-shop-option",
  "keyword": "Feature"
});
formatter.before({
  "duration": 470123497,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login and place an order through shop option",
  "description": "",
  "id": "login-into-the-automation-practice-site-and-place-an-order-for-a-book-through-shop-option;login-and-place-an-order-through-shop-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@shop"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens the automation practice site url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on My Account option",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter username And password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on shop option",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "add HTML5 Forms to basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on view basket",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on proceed to checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "fill billing details",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#And select Direct Bank Transfer option"
    }
  ],
  "line": 16,
  "name": "click on Place Order button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify thank you message",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "print the order number",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "logout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "BookShoppingLoginStepDefinition.user_opens_the_automation_practice_site_url()"
});
formatter.result({
  "duration": 18199528721,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingMyAccountStepDefinitions.click_on_My_Account_option()"
});
formatter.result({
  "duration": 9815409178,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingLoginStepDefinition.enter_username_And_password()"
});
formatter.result({
  "duration": 1134583001,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingLoginStepDefinition.click_on_login_button()"
});
formatter.result({
  "duration": 7105760117,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingMyAccountStepDefinitions.verify_the_logged_in_username()"
});
formatter.result({
  "duration": 62550744,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingShopStepDefinition.click_on_shop_option()"
});
formatter.result({
  "duration": 5751854717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 8
    }
  ],
  "location": "BookShoppingShopStepDefinition.add_HTML_Forms_to_basket(int)"
});
formatter.result({
  "duration": 209024392,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingShopStepDefinition.click_on_view_basket()"
});
formatter.result({
  "duration": 5647188567,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingBasketStepDefintion.click_on_proceed_to_checkout()"
});
formatter.result({
  "duration": 5340031032,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingUserCheckOutStepDefinition.fill_billing_details()"
});
formatter.result({
  "duration": 2359590770,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingUserCheckOutStepDefinition.click_on_Place_Order_button()"
});
formatter.result({
  "duration": 176180624,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingOrderReceivedStepDefinitions.verify_thank_you_message()"
});
formatter.result({
  "duration": 5747403113,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingOrderReceivedStepDefinitions.print_the_order_number()"
});
formatter.result({
  "duration": 38994896,
  "status": "passed"
});
formatter.match({
  "location": "BookShoppingLogoutStepDefinition.logout_from_the_application()"
});
formatter.result({
  "duration": 10723794178,
  "status": "passed"
});
formatter.after({
  "duration": 610459820,
  "status": "passed"
});
});