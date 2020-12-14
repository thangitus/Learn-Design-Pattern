# Composite pattern
## Applicability
 - Use the Composite pattern when you have to implement a tree-like object structure.

 - The Composite pattern provides you with two basic element types that share a common interface: simple leaves and complex containers. A container can be composed of both leaves and other containers. This lets you construct a nested recursive object structure that resembles a tree.

 - Use the pattern when you want the client code to treat both simple and complex elements uniformly.

 - All elements defined by the Composite pattern share a common interface. Using this interface, the client doesn’t have to worry about the concrete class of the objects it works with.

## Pros and Cons
### Pros
 - You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
 - Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.

### Cons 
 - It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.