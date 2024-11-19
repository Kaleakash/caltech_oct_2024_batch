var Car = /** @class */ (function () {
    function Car() {
        this.wheel = 4;
        this.color = "Gray";
        this.price = 4400000;
    }
    Car.prototype.start = function () {
        console.log("Car Start");
    };
    Car.prototype.stop = function () {
        console.log("Stop Car");
    };
    Car.prototype.displayInfo = function (msg) {
        console.log(msg);
        console.log("wheel " + this.wheel);
        console.log("color " + this.color);
        console.log("price " + this.price);
    };
    return Car;
}());
var innova = new Car(); // innova is object reference to access property and behaviour of car
innova.start();
innova.stop();
innova.price = 4000000;
innova.displayInfo("Innova Car Details");
var bmw = new Car();
bmw.start();
bmw.stop();
bmw.price = 9800000;
bmw.color = "White";
bmw.displayInfo("BMW Car Details");
