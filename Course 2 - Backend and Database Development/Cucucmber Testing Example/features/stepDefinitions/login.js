const {Given,When,Then,After,Before}=require("@cucumber/cucumber")
const {Builder,By,until}=require("selenium-webdriver")
const assert=require("assert")
let driver;
Before(async function(){
    driver = await new Builder().forBrowser("chrome").build();  // to make the code synchronous 
})
Given('I navigate to the login page',async function () {
    await driver.get("http://localhost:4200/login")
});
When('I enter valid username and password', async function () {
    const email1 = await driver.findElement(By.id("email"));
    const password1 = await driver.findElement(By.id("password"));
    await email1.sendKeys("akash@gmail.com");   // using cucumber we are going to write information in text filed 
    await password1.sendKeys("akash123");
});
When('I click on the login button for success',  async function () {
    const loginButton1 = await driver.findElement(By.id("submitButton"));
    await loginButton1.click();
});
Then('I should be redirected to the home page', async function () {
    await driver.wait(until.urlContains("/home"),5000);
    const currentUrl = await driver.getCurrentUrl();   
    assert.ok(currentUrl.includes("/home"));
});
When('I enter invalid username and password', async function () {
    const email2 = await driver.findElement(By.id("email"));
    const password2 = await driver.findElement(By.id("password"));
    await email2.sendKeys("akash12@gmail.com");
    await password2.sendKeys("1235656");
});
When('I click on the login button for failure', async function () {
    const loginButton2 = await driver.findElement(By.id("submitButton"));
    await loginButton2.click();
});
Then('I should see an error message indicating invalid credentials', async function () {
    const alert = await driver.switchTo().alert();      // switch from browser to alert box 
    const alertText = await alert.getText();
    assert.equal(alertText, "failure try once again");
    await alert.accept();           // close that alert 
});
//This function close angular project 
After(async function(){
await driver.quit();
})
