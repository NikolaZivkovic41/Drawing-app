# Drawing app 

Drawing app using Java Swing GUI and design patterns (MVC, Singleton, Command, Observer, Strategy).

![alt text](https://github.com/NikolaZivkovic41/Drawing-app/blob/master/Drawing-app/res/Icons/drawing-app.PNG)

## Preview of the working app

![alt text](https://github.com/NikolaZivkovic41/Drawing-app/blob/master/Drawing-app/res/Icons/drawing-app1.PNG)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

What things you need to install the software and how to install them

* [Eclipse](https://www.eclipse.org/) - integrated development environment
* [WindowBuilder](http://download.eclipse.org/windowbuilder/WB/integration/4.6/) - java swing GUI
* [Hexagon.jar](https://github.com/NikolaZivkovic41/Drawing-app/blob/master/Drawing-app/HexagonJar/heksagon.jar) - jar library for hexagon objects

### WindowBuilder install steps:
* Open Eclipse and go to Help/Install New Software...
* In URl part type the following: http://download.eclipse.org/windowbuilder/WB/integration/4.6/ and click enter
* Install WindowBuilder (it might take a while)

### Starting a copy of this project:
* Go to root directory of this project on GitHub and Click Clone or Download Zip. U can download the zip file or u can clone it through the given url
* Download steps: Unzip the file, open Eclipse and click File/Open Projects from File System ... Find the location of unzipped folder and open it ... Setting up Hexagon library: right click the project folder, click Properties and go to Java Build Path ... Click Libraries and click Add External JARs... Navigate to heksagon.jar file from project folder and add it to the list... Click Apply and close and you are ready to start the application... Open the project folder, navigate to mvc/Application.java, rigth click the .java file and Run As/Java application

* URL steps: Open Eclipse, click File/Import ... Find Git/Projects from Git and click Next ... Check Clone URl and click Next ... In URl text box enter cloned URl and click Next ... Click Next again and the project should be cloned ... Setting up Hexagon library: right click the project folder, click Properties and go to Java Build Path ... Click Libraries and click Add External JARs... Navigate to heksagon.jar file from project folder and add it to the list... Click Apply and close and you are ready to start the application... Open the project folder, navigate to mvc/Application.java, rigth click the .java file and Run As/Java application

### Starting Java Swing GUI project:
* Open File/New/Java Project
* Create the project and open it
* Right click the src folder and click New/Other ... Find WindowBuilder/Swing Designer ... and click Application Window
* Package text box is reffering to package with all Java classes
* Name text box is reffering to main Frame that will start your app 
* Create project and right click the main Frame (it will be .java file) that u created in step above and click Run As/Java Application and the app will start
