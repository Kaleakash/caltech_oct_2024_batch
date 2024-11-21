// interface with variable 
interface EmployeeType {
    id:number;
    fname:string;
    salary:number;
    age?:number;
}

let emp1={id:"100abc",name:100,age:"abc"};

let emp2:EmployeeType={id:100,fname:"Steven",salary:45000}
let emp3:EmployeeType={id:101,fname:"John",salary:48000,age:34}

// interface with functions to provide specification 
interface Bank {
    withdraw():void;
    deposit():void;
}
class Rbi implements Bank {
    withdraw():void{
            console.log("In RBI withdrawn functionality")
    }
    deposit():void{
        console.log("In RBI deposit functionality")
    }
}
class BankOfAmerica implements Bank {
    withdraw():void{
            console.log("In BankOfAmerica withdrawn functionality")
    }
    deposit():void{
        console.log("In BankOfAmerica deposit functionality")
    }
}
let obj1 = new Rbi();
obj1.deposit();
obj1.withdraw();
let obj2 =new BankOfAmerica();
obj2.deposit();
obj2.withdraw();
