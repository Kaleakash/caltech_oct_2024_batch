const {When,Then,Given}=require("@cucumber/cucumber");

let a,b,sum;

Given('Numbers are provided', function () {
    a=10;
    b=20;
    return 'done';
});

When('Doing the addition of two numbers', function () {
    sum = a+b;
    return 'addition done';
});

Then('Display the output of two numbers', function () {
    console.log(sum);
    return 'Display the output';
});
