/*interface:
 slow;
 class can implement many interface;
 use "implements" to use;
 can't inherent a class;
 can’t provide any code;
 only can have one abstract class;
 does not have access modifiers;
 have no data filed;
 can't declare constructors or destructors;
 */

/*abstract class:
fast;
class can only extend one abstract class;
use "extends" to use;
can inherent a class;
can provide code and can be overridden;
can have abstract and concrete methods;
can have an access modifier;
can have data filed;
can declare constructors or destructors;

 */
/**
 * difference between abstract class and interface
 *
 * 1.abstract class: "is a" relation class(mostly describe something's natual thing)
 *   interface: "has a" relation with class(mostly describe something's functions)
 *
 * 2.abstract class:could realize some methods
 *   interface: totally abstract, do not realize any methods
 *
 * 3.abstract class: son-class realize it in "extends"
 *    interface: use implements
 *
 * 4.abstract class:could have constructors
 *   interface: no constructors
 *
 * 5.abstract class: could have main method
 *  interface: could not have main method
 *
 * 6.abstract class: faster than interface
 *  interface:slower than abstract class
 */