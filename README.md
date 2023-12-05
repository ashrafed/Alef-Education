The main Frameworks included in the project: SHAFT Engine on the Top of:
----------------------------------------------

--+> Selenium Java

--+> Maven

--+> TestNG

--+> Allure Report

--+> Extent Reports

--+> Project Design: 

--+> Data Driven framework

Object Model design pattern
----------------------------------------------

How To Use this Project with High-level Framework:
======================================

● You can use it with any IDE like ==> EX: IntelliJ IDE If you are going to use Intelij You
Should First follow these steps :

● IntelliJ: As of SHAFT_Engine you can now use IntelliJ and Eclipse to manage your
test project.

● After checking out the project to your IntelliJ you may face an exception that prevents
test execution IF the Project not working.

● In that case, you must add the SHAFT_Engine custom listeners to your TestNG
execution template, as IntelliJ doesn't natively inherit this list from the pom.xml file.

----------------------------------------------
Listeners:
----------------------------------------------
com.shaft.listeners.TestNGListener
