### These principles helps the developer to write cleaner codes to be easier to manage

S — Single Responsiblity Principle  
O — Open-Closed Principle  
L — Liskov Substitution Principle  
I — Interface Segregation Principle  
D — Dependency Inversion Principle

### SRP - Single Responsiblity Principle  

A **bad practice** are including methods which doesn't belong to Planet, such as starName or moonDimension

The violation of Single Responsibility Principle can generate some issue such as:

* Lack of Cohesion - a class cannot assume responsabilities that aren't their
* High Coupling - More responsabilities generate a higher level of dependency, making the system fragile to modifications
* Difficult to implement unit tests
* Difficult to reuse the code


In the other hand, **good practice** says that each class must have only methods and variables which belongs to it's class, separated as we did to Moon, Planet and Star, this will allow a good maintainability on the system with a higher cohesion


### OCP - Open-Closed Principle

The OCP says that a function needs to be opened to extension but closed for modification

With that in mind, a **bad example** would be a method which select which object to create using conditions or loops like if or switch case

A good practice in that case would be a creation of an interface in order to setup a common method to be used in this case, then is just about to receieve the object and use the implemented function

### LSP - Liskov Substitution Principle

LSP is more an advise or warning than a rule, which says that a mothod cannot return error because of an implemented interface for example

A **bad example** in this case is when a method cannot deal with a method brought from an interface

The **solution would** be re-engening the solution in order to remove this method from the class

### ISP - Interface Segregation Principle

The interface segregation says that class cannot have an unuseful method that came from the implemented interface, by that it's possible to create another interface just to fulfill the need to have that function only for the required classes

The **bad example** is when the method exists on that class which don't really need it(inherented from interface) and an error is thown

The **solution** is to segregate the interface by creating other interface only for that especific method, then implement it(or remove) from the classes accordily

### DIP - Dependency Inversion Principle

This principle refers to the inversion of the dependencies from the software modules, by that there are two rules:
* Higher software modules shouldn't depend the modules from lower levels
* Abstraction should not rely on details, details should depend on abstractions

The issue could be when a function requires many others classes to work, requiring a higher level of management of them

The solution is to recieve the object itself instead of create it inside the method, requiring all the dependecies
