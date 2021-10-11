$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HireVehicleInsurance.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 4,
  "name": "Hire Vehicle Insurance",
  "description": "I want to hire a vehicle insurance to my car",
  "id": "hire-vehicle-insurance",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@hireVehicleInsurance"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Fill form to hire a vehicle insurance",
  "description": "",
  "id": "hire-vehicle-insurance;fill-form-to-hire-a-vehicle-insurance",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@fillFormToHireInsurance"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "that I in home page of Tricents site",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "access Automobile Insurance",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I fill form of Vehicle Data",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "fill form of Insurant Data",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "fill form of Product Data",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select a Price Option",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "send a quote",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I validate the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessAutomobileInsuranceSteps.thatIInHomePageOfTricentsSite()"
});
formatter.result({
  "duration": 5846879200,
  "status": "passed"
});
formatter.match({
  "location": "AccessAutomobileInsuranceSteps.accessAutomobileInsurance()"
});
formatter.result({
  "duration": 1630844100,
  "status": "passed"
});
formatter.match({
  "location": "HireInsuranceSteps.iFillFormOfVehicleData()"
});
formatter.result({
  "duration": 1248483700,
  "status": "passed"
});
formatter.match({
  "location": "HireInsuranceSteps.fillFormOfInsurantData()"
});
formatter.result({
  "duration": 2637063400,
  "status": "passed"
});
formatter.match({
  "location": "HireInsuranceSteps.fillFormOfProductData()"
});
formatter.result({
  "duration": 943731500,
  "status": "passed"
});
formatter.match({
  "location": "HireInsuranceSteps.selectAPriceOption()"
});
formatter.result({
  "duration": 732710400,
  "status": "passed"
});
formatter.match({
  "location": "HireInsuranceSteps.sendAQuote()"
});
formatter.result({
  "duration": 661369100,
  "status": "passed"
});
formatter.match({
  "location": "HireInsuranceSteps.iValidateTheSuccessMessage()"
});
formatter.result({
  "duration": 9009686300,
  "status": "passed"
});
});