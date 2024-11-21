var emp1 = { id: "100abc", name: 100, age: "abc" };
var emp2 = { id: 100, fname: "Steven", salary: 45000 };
var emp3 = { id: 101, fname: "John", salary: 48000, age: 34 };
var Rbi = /** @class */ (function () {
    function Rbi() {
    }
    Rbi.prototype.withdraw = function () {
        console.log("In RBI withdrawn functionality");
    };
    Rbi.prototype.deposit = function () {
        console.log("In RBI deposit functionality");
    };
    return Rbi;
}());
var BankOfAmerica = /** @class */ (function () {
    function BankOfAmerica() {
    }
    BankOfAmerica.prototype.withdraw = function () {
        console.log("In BankOfAmerica withdrawn functionality");
    };
    BankOfAmerica.prototype.deposit = function () {
        console.log("In BankOfAmerica deposit functionality");
    };
    return BankOfAmerica;
}());
var obj1 = new Rbi();
obj1.deposit();
obj1.withdraw();
var obj2 = new BankOfAmerica();
obj2.deposit();
obj2.withdraw();
