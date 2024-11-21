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
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// Inheritance Example 
var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.displayEmployeeInfo = function () {
        console.log("id is " + this.id);
        console.log("name is " + this.fname);
    };
    return Employee;
}());
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Manager.prototype.displayManagerInfo = function () {
        console.log("number of emp working under him/her " + this.numberOfEmp);
    };
    return Manager;
}(Employee));
var mgr1 = new Manager();
mgr1.id = 100;
mgr1.fname = "John";
mgr1.numberOfEmp = 10;
mgr1.displayEmployeeInfo();
mgr1.displayManagerInfo();
