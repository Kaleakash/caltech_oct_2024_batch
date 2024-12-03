const {Then,Given,After}=require("@cucumber/cucumber");
const {Builder,By,until} = require("selenium-webdriver");
const assert = require("assert");       // it provide pre defined function to test the code
let driver;
Given('I Open the Angular Application', async function () {
    // Write code here that turns the phrase above into concrete actions
    driver = new  Builder().forBrowser('chrome').build();
    await driver.get("http://localhost:4200/"); // open angular project must be running. 
    await driver.wait(until.elementLocated(By.id("h1Info")),10000);
    return 'done';
});
Then('I should see the welcome message {string}', async function (string) {
    // Write code here that turns the phrase above into concrete actions
    const text = await driver.findElement(By.id("h1Info")).getText();
    assert.equal(text,"Welcome to Angular App")
    return 'done';
});
After(async function () {
    try{
        await driver.quit();
    }catch(e){}
})