function getFullName() {
  return this.firstName + " " + this.lastName;
}

let person = {
  firstName: "Amos",
  lastName: "Machora",
  getFullName: getFullName,
};

// console.log(person.getFullName.bind(person)());

class Person {
  constructor(firstName, secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
  }
}

const amos = new Person("Amos", "Machora");

console.log(amos);
