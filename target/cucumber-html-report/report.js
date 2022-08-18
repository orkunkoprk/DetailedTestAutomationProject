$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/contactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber Test Automation contactUs",
  "description": "",
  "id": "cucumber-test-automation-contactus",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "contactUs Scenario",
  "description": "",
  "id": "cucumber-test-automation-contactus;contactus-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Go to Website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "ContactUs butonuna tiklanir",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "SubjectHeading seceneklerinden Webmaster secilir",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "\"\u003cEmailAdress\u003e\" EmailAdress girilir",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "\"\u003cOrderReferance\u003e\" Order reference girilir",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\"\u003cMessage\u003e\" Message yazilir",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Send butonuna tiklanir",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "cucumber-test-automation-contactus;contactus-scenario;",
  "rows": [
    {
      "cells": [
        "EmailAdress",
        "OrderReferance",
        "Message"
      ],
      "line": 11,
      "id": "cucumber-test-automation-contactus;contactus-scenario;;1"
    },
    {
      "cells": [
        "orkun1@gmail.com",
        "12345689",
        "adssadaklsdlskadklşsadsaşldşlksaldsa"
      ],
      "line": 12,
      "id": "cucumber-test-automation-contactus;contactus-scenario;;2"
    },
    {
      "cells": [
        "sinem10@gmail.com",
        "98746521",
        "oalsdklasşdjvnxaklcasdasdadsdsads"
      ],
      "line": 13,
      "id": "cucumber-test-automation-contactus;contactus-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "contactUs Scenario",
  "description": "",
  "id": "cucumber-test-automation-contactus;contactus-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Go to Website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "ContactUs butonuna tiklanir",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "SubjectHeading seceneklerinden Webmaster secilir",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "\"orkun1@gmail.com\" EmailAdress girilir",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "\"12345689\" Order reference girilir",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\"adssadaklsdlskadklşsadsaşldşlksaldsa\" Message yazilir",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Send butonuna tiklanir",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.go_to_Website()"
});
formatter.result({
  "duration": 22475780201,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.contactusButonunaTiklanir()"
});
formatter.result({
  "duration": 57093511600,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.subjectheadingSeceneklerindenWebmasterSecilir()"
});
formatter.result({
  "duration": 90122701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "orkun1@gmail.com",
      "offset": 1
    }
  ],
  "location": "ContactSteps.emailadressGirilir(String)"
});
formatter.result({
  "duration": 98185900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345689",
      "offset": 1
    }
  ],
  "location": "ContactSteps.orderReferenceGirilir(String)"
});
formatter.result({
  "duration": 124924600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adssadaklsdlskadklşsadsaşldşlksaldsa",
      "offset": 1
    }
  ],
  "location": "ContactSteps.messageYazilir(String)"
});
formatter.result({
  "duration": 110282700,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.sendButonunaTiklanir()"
});
formatter.result({
  "duration": 5226439300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "contactUs Scenario",
  "description": "",
  "id": "cucumber-test-automation-contactus;contactus-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Go to Website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "ContactUs butonuna tiklanir",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "SubjectHeading seceneklerinden Webmaster secilir",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "\"sinem10@gmail.com\" EmailAdress girilir",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "\"98746521\" Order reference girilir",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\"oalsdklasşdjvnxaklcasdasdadsdsads\" Message yazilir",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Send butonuna tiklanir",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.go_to_Website()"
});
formatter.result({
  "duration": 3098211200,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.contactusButonunaTiklanir()"
});
formatter.result({
  "duration": 1516795499,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.subjectheadingSeceneklerindenWebmasterSecilir()"
});
formatter.result({
  "duration": 69094600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sinem10@gmail.com",
      "offset": 1
    }
  ],
  "location": "ContactSteps.emailadressGirilir(String)"
});
formatter.result({
  "duration": 88998701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "98746521",
      "offset": 1
    }
  ],
  "location": "ContactSteps.orderReferenceGirilir(String)"
});
formatter.result({
  "duration": 98264600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oalsdklasşdjvnxaklcasdasdadsdsads",
      "offset": 1
    }
  ],
  "location": "ContactSteps.messageYazilir(String)"
});
formatter.result({
  "duration": 104454000,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.sendButonunaTiklanir()"
});
formatter.result({
  "duration": 3213066100,
  "status": "passed"
});
});