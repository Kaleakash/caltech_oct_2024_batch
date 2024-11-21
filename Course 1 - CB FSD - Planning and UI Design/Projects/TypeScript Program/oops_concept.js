var Employee = /** @class */ (function () {
    // constructor() {
    //     console.log("employee class object created..")
    //     this.id=100;
    //     this.fname="Steven";
    //     this.salary=45000;
    // }
    function Employee(id, fname, salary) {
        if (fname === void 0) { fname = "Unknown"; }
        if (salary === void 0) { salary = 20000; }
        this.id = id;
        this.fname = fname;
        this.salary = salary;
    }
    Employee.prototype.display = function () {
        console.log("display function");
        console.log("id is " + this.id);
        console.log("name is " + this.fname);
        console.log("salary is " + this.salary);
    };
    return Employee;
}());
var emp1 = new Employee(100, "Steven", 45000);
var emp2 = new Employee(101, "Lex", 46000);
var emp3 = new Employee(102, "John", 48000);
var emp4 = new Employee(103, "Raj");
var emp5 = new Employee(105);
emp1.display();
emp2.display();
emp3.display();
emp4.display();
emp5.display();
