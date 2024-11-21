// class Employee {
//     id:number;
//     fname:string;
//     salary:number;
//     // constructor() {
//     //     console.log("employee class object created..")
//     //     this.id=100;
//     //     this.fname="Steven";
//     //     this.salary=45000;
//     // }
//     constructor(id:number,fname:string="Unknown",salary:number=20000){
//             this.id=id;
//             this.fname=fname;
//             this.salary=salary;
//     }
//     display() : void {
//         console.log("display function")
//         console.log("id is "+this.id)
//         console.log("name is "+this.fname)
//         console.log("salary is "+this.salary)
//     }
// }
// let emp1 = new Employee(100,"Steven",45000);
// let emp2 = new Employee(101,"Lex",46000);
// let emp3 = new Employee(102,"John",48000);
// let emp4 = new Employee(103,"Raj")
// let emp5 = new Employee(105)
// emp1.display();
// emp2.display();
// emp3.display();
// emp4.display();
// emp5.display();

// Inheritance Example 
class Employee {
    id:number;
    fname:string;
    displayEmployeeInfo(): void {
        console.log("id is "+this.id)
        console.log("name is "+this.fname);
    }
}
class Manager extends Employee{
    numberOfEmp:number;
    displayManagerInfo():void {
        console.log("number of emp working under him/her "+this.numberOfEmp);
    }
}
let mgr1 = new Manager();
mgr1.id=100;
mgr1.fname="John";
mgr1.numberOfEmp=10;
mgr1.displayEmployeeInfo();
mgr1.displayManagerInfo();