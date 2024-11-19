class Car {
    wheel:number=4;
    color:string ="Gray";
    price:number = 4400000;
    start():void {
        console.log("Car Start")
    }
    stop(): void {
        console.log("Stop Car")
    }
    displayInfo(msg:string): void {
        console.log(msg)
        console.log("wheel "+this.wheel)
        console.log("color "+this.color)
        console.log("price "+this.price)
    }
}
let innova = new Car(); // innova is object reference to access property and behaviour of car
innova.start();
innova.stop();
innova.price=4000000;
innova.displayInfo("Innova Car Details");

let bmw = new Car();
bmw.start();
bmw.stop();
bmw.price=9800000;
bmw.color="White";
bmw.displayInfo("BMW Car Details");
