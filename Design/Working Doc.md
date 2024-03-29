Working Document – CP2406 Car Traffic Simulator by Aidan Megee

Problem Specification:
Design a Car Traffic Simulation that tracks a car moving from a road to another road with traffic lights positioned at the end of the first road. The program will be used to simulate traffic on roads going through traffic lights. The idea is that the car moves along the first road, then at the end of the first road, the traffic lights will display either green or red, if the traffic lights display red, the car stays in the same position on that road until the traffic lights turn green to move to the second road. The second road does not have any traffic lights.
To start if with, I had to figure out how all the different classes were going to work together. To do this I decided to write small blocks of pseudocode for each class. E.g. Model.Car must track which road its on along with what position on each road. Traffic light has two states, green and red or stop and go, along with a rate of change depending on what random number the program is to spit out. The Model.Road has the next road its connected to and a length. 
After writing small blocks of pseudo code, I decided to draw something like a UML diagram where I could visualise which classes go to where or what class extends what class. For example, the road class is to extend the Model.Car class and the Traffic Light class extends the Model.Road class and so on.

Approaching the problem:
Going into writing the program for the Car Traffic Simulator, I decided to work on the project bit by bit, 
first working on the Car and Road classes so I didn’t become confused over what code goes where. I then made test classes for the Model.Car and Model.Road class to check that the Model.Car position moves by 1 and that the car tracks what road it is on. I then wrote code to test that road connects to another road and tested the road length. 

Creating the Sub-Classes:
After the Road and Car class were completed along with their test code. I then went on to complete the Traffic Light class. I started to run into some issues here and had trouble with figuring out how to write the code. I tried using Boolean values for green and red, although this didn’t work out so well because when printing whether the traffic light was red or green it would print true or false which isn’t helpful in this project. I then decided to use Strings and set the colour green/colour red to “Green” and “Red” which made a huge difference. The rate of change for the Traffic Light class was also a bit of a struggle, I knew how I wanted to write it using a random number generated between two values, in this case 0.01 and 0.99 although I wasn’t sure of the syntax. After some research going through coding resources on learnJCU I found out how I wanted to write the code for this random number generator in a way I could understand, and it worked exactly how I wanted it to. I then proceeded to write test code for the Traffic Light class to test the String values and Min and Max Rate of Change. 

Classes:
*TrafficLight
*Car
*Road
*MainSimulation

Every class except MainSimulation has unit testing to check that methods work correctly
operate() method in Traffic Light class operates the traffic lights determing colour
carMove() method in the Car class increments the cars position on road.
roadChange() method in the Road class moves the car from road 1 to road 2 by incrementing the roadID



Implementing Main Simulation Class:
After completing all three out of four classes needed for the project along with the test code. 
I started on the MainSimulation Class of my project which is where everything is simulated. 
I started to write out main() and using a while loop so the car keeps increments by 1 each time the car position is less than 4. 
When the Car is at position 4 on road 1, the car would then move to road 2 but the car can only move to road 2 If the traffic light is green, this is where problems started to occur. I was unable to use Boolean values here, so I had to find a way to make the car move if the Traffic Lights are NOT red. Currently still having issues with the Model.Car moving to Model.Road 2 even if the Traffic Light is red. 
After the Car moves to the second road, I implemented another while loop and another position on road value so I could track the car on the second road for readability purposes.

Added code so traffic light doesn't operate on road 2 since the traffic light is only at the end of road 1.

Problem correction:
After coming to the realisation I had created a procedural program instead of using objects in this project. 
I had to go back and redesign my classes and unit tests so that methods could be called back into the main simulation,
after some changes to my sub-classes for this project, I started to implement these methods by calling them in main when needed.
Currently the lights stay red and will have to change based on the operate() method in the
Traffic Light class, to fix this, the currentstate of the traffic lights will have to be
changed in order to create a simulation of traffic lights.

***FIXED 12/09/2019 - Car moves to road 2 if light is green, although program ends if traffic lights are red
to fix this, a loop to constantly call the operate() method in main each time the light is red until the light
changes colour to green so the car can move to the second road.

Added code so that traffic lights don't operate when car moves to road 2.
Added an else if statement for traffic light current state so car moves to road 2 if green

Issue: ***FIXED 13/09/2019
Program ends if traffic light is red on road 1 position 4.
Program outputs "Car is stopped at red light" if lights are red when car is at position 4 on road 1.
Program continues to call the operate() method from the Traffic Light class until lights change.

------------------------------------------------------------------------------------------------------------------------

Assignment 2 - Problems - Start 11/10/2019

- Fix UML to match future code/end project
- Test all getter/setter combinations using values different to the constructor values
- Apply better consistency of white spacing
- Add more descriptive names to the variables
- Change traffic light double to a float
- Change traffic light class to use enums instead of boolean array
- Main Simulation held majority of the class logic
- Road "has a" Car add the road or car class "moves" the car

Problem fixes starting from the top.


Fix tests for each class to properly test getter/setter combinations are working how intended.

Vehicle class (Renamed from Car class):

## MODEL - The Model Classes (Vehicles, Road, Traffic Lights)

Vehicle is designed to move along a road and stop at traffic lights based on their current state. Then if the 
traffic light state is green the vehicle moves to a connecting road. 

Vehicle attributes: For Car, Bus and Motorbike classes inherit from Vehicle
- speed(int)
- positionOnRoad(int)
- id(int)
- vehicleLength(float)
- vehicleBreadth(int)

Road attributes:
- roadLength(int)
- roadNumber(int)
- roadWidth(int)

Road Methods:
- draw(Graphics roadGraphics) -> draws road objects
- removeVehicle() -> removes vehicle from a road if vehicle is at the end of the road
- moveVehicle() -> moves any vehicle on any said road
- slowVehicle() -> slows vehicles based on if a traffic light is orange then halves the speed
then sets speed to 0 based on vehicles position on a road.

Traffic Light attributes:
- lightPositionOnRoad(int)
- trafficLightState {RED, ORANGE, GREEN} (enum)

Traffic Light Methods:
- operate() -> operates traffic light changing it's state

The Road moves each vehicle type (Car, Bus, Motorbike) each with their own specific lengths.
Begin to change the Car class to make the car class to handle more of the logic that the Car on a "Road" should
be responsible for. Throughout assignment 1, I put a lot of the Car's logic in main.

Renamed Car class to Vehicle class to accommodate for the addition of different vehicles (car, motorbike, bus)
Added speed, vehicleLength and vehicleBreadth along with getter/setter methods for these variables.
The plan is to finish the Vehicle class and VehicleTest class before moving on to other classes and their current problems.

Add @param block comment for Vehicle class constructor to give a brief explanation of the variables in that class.
Move vehicleMove() method to road class for understandability.

Remove vehicle test because it is now abstract, instead created tests for each of its subclasses.
Made Vehicle class abstract so subclasses (Car, Motorbike and Bus) extends the abstract Vehicle class. Removed vehicle test
and test each sub class of vehicle works accordingly. Add test for all 3 subclasses of Vehicle and test different vehicleLengths
for each different "Vehicle type" so to speak.

Set traffic light position to the road length - 1 therefore a car can change road if it's position on a road is exactly equal
to its length, in this case if 30, otherwise the vehicle stops at position 28, on segment behind

Car class now draws a car or "itself". Road class now draws a road with a line in the center.
Need to find a way to move the drawn car on a road in main.

Made vehicleLength abstract then set each subclass of vehicle length to its correct length respectively (motorbike is 0.5 * car length)
and (bus is 3 * car length). Converted vehicleLength and also had to convert vehicleBreadth to float to accommodate 0.5 * car length for the motorbike subclass.

Road Class now has addVehicle() method that adds a random vehicle object index 0, 1, 2 using a switch function that then adds that to the arrayList of
vehicle objects.

Added moveVehicle() method that uses a for each loop to iterate through the vehicle ArrayList and gets the position of each vehicle,
then if the position is less than the road length, the vehicle moves along the road based on the speed in which the vehicle is travelling.

## VIEW - The View Classes (mainFrame and Simulation class)

mainFrame Methods:
- Add action listeners to all JMenuItems to be used in Main(Controller)
- Add action Listener for addRoad JButton

Simulation Methods:
- addStraightRoad()
- addVehicle() -> Randomly generates a number from 0 - 2 (0, 1, 2) then determines what vehicle spawns
- addTrafficLight() -> Adds traffic light to arrayList of type <TrafficLight> object
- changeRoad() -> nested for each loop determines which vehicle changes on which road

Added initial code for the GUI in the Simulation class for the menu bar for City editing and Simulation. Added a main class to test GUI
works as intended and to start testing my classes for the traffic simulation.

Added a JPanel and set the layout to a grid layout so the view of the city/roads and traffic etc. can be on the right side
of the JFrame and then all the buttons and other labels outputting data can be visible at the same time as the view of the simulation.

Testing to see how to approach the Simulation class that essentially holds the view and main controls the simulation.
Put a large portion of the code from Road class into Simulation class. Transferred the test classes, although commented out for now.

Added a bottomPanel JPanel object for the mode and status labels. Then added a cityViewPanel which will display the roads, cars etc.
Simulation class now draws a road, need to add a method that draws a line separating both lanes on the road.

Added initial code for the GUI in the Simulation class for the menu bar for City editing and View.Simulation. Added a main class to test GUI
works as intended and to start testing my classes for the traffic simulation.

Added a JPanel and set the layout to a grid layout so the view of the city/roads and traffic etc. can be on the right side
of the JFrame and then all the buttons and other labels outputting data can be visible at the same time as the view of the simulation.

Testing to see how to approach the Simulation class that essentially holds the view and main controls the simulation.
Put a large portion of the code from Road class into Simulation class. Transferred the test classes, although commented out for now.


Added test for Road class to test random vehicle object (Car, bus or motorbike) to be added to the ArrayList of vehicle objects.
checked the getter and setter methods are working as intended using different values then the constructor.

Added test to check that the moveVehicle() method changes the vehicles position if the position is less than the road length and
the speed is at least 1.

Removed all code from Traffic light class due to previously having a boolean array to check if the lights were green or red
was extremely unreadable and a bad coding practice. Starting from scratch I will use enums to check the colour of the traffic lights
then determine if vehicles will move to connected roads after traffic lights are green or stay on a road if they're orange/red.

Added enum for traffic light class for traffic light state to stay green and red for 1000 milliseconds and orange for 500 milliseconds
using Thread.sleep. Currently still need to test if operate() method works as intended. Set a currentState variable to start
off as green then change based on a timer in future.

Created addTrafficLight() method to add traffic lights at the end of roads based on the length of a road. Originally had this
method in the Traffic Light class although moved it to road because Road "has a" traffic light, a traffic light doesn't
"have a" traffic light. Fixed logic error for this.

addRoad() method that adds a connecting road based on if a user wants to add roads to the simulation, this is different
to the changeRoad() method that will be implemented after traffic light class is complete and tests work as intended.

currently having issues based on how to add roads and make vehicles travel to new roads. Potential fix could be to put the
addRoad() method in vehicles sub classes then call them directly for each different vehicle type.

Added a changeRoad() method that iterates through road ArrayList and then checks the current state of the traffic light
if the lights are green at the end of the road, create a new road then add the new road to the ArrayList.

Changing moveVehicle() method to now move the vehicles to another road after checking the state of the traffic lights.
If the traffic lights are green and the vehicle is at the end of a road, the vehicle changes road. If the vehicle is at
position 24 out of 30 on a road and the traffic lights are Orange, the speed of the vehicle is set to its current speed - it's speed.
At the current time the speed for all vehicles is 1 so the vehicle is just speed - 1.

Put a "Test" main in Road to test the moveVehicle() method is working with all objects (traffic light, vehicles and roads)
Playing around with removeVehicle() so that if there are no connecting roads, the vehicle is removed from the road and essentially
disappears.

Modified changeRoad() test to call it's method in traffic light class that adds connecting roads to road ArrayList instead
of adding it in the test.

addTrafficLight() test was to test that Traffic lights ArrayList is not empty. Currently trying to resolve
the moveVehicle() method so that any vehicle will move to another road if there is a connecting road.

Added a slowVehicle() method instead of having every thing in the moveVehicle() method as it was becoming very large, slowVehicle()
is now responsible for if a vehicle is near the end of a road (getRoadLength() - 6), the vehicle halves it's speed
then when the lights turn red, the vehicle comes to a complete stop by setting it's speed to 0.

Added to changeRoad() method to check if ArrayList for roads is empty, if so, removes vehicle from end of road as there are no roads to go to
Added a more object-orientated approach to the slowVehicle() method instead of just using random integer values, use getter/setter methods
to determine the new positionOnRoad etc.

Made slowVehicle() and removeVehicle() use a nested for each loop that determines the current traffic light on the current road
instead of using 0 index which would just base everything off of that particular traffic light.

changeRoad() method now doesn't change based on traffic light colour because if vehicle is at the end of a road, it should
move itself to the next road if there is a connecting road, the traffic lights are at the end of the road but the vehicle
can only be at position 30 out of 30 if the lights are green making the changeRoad() method much smaller using a for each
loop for both connectingRoads ArrayList and currentVehicles ArrayList.

Added a bottomPanel JPanel object for the mode and status labels. Then added a cityViewPanel which will display the roads, cars etc.
Simulation class now draws a road, need to add a method that draws a line separating both lanes on the road.
Added a mainFrame class that will hold all of the GUI components then instantiate mainFrame in main.

## CONTROLLER - Main Class (Main)

Action listener events to be set as methods in the mainFrame class then using lambda expressions to handle the events in the
controller (Main).

Create new City instantiates a new JPanel for editing a city, namely cityEditingPanel.
This panel has a JButton that the user can click to add a Road object to the city.