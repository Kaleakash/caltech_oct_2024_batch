var Employee = /** @class */ (function () {
    function Employee() {
        console.log("employee class object created..");
        this.id = 100;
        this.fname = "Steven";
        this.salary = 45000;
    }
    Employee.prototype.display = function () {
        console.log("display function");
        console.log("id is " + this.id);
        console.log("name is " + this.fname);
        console.log("salary is " + this.salary);
    };
    return Employee;
}());
var emp1 = new Employee();
emp1.display();
