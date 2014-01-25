android-tutorial-1
==================

Source code for application developed in Android Development lecture 1

Common bugs you may encounter
-----------------------------

1.  On opening eclipse.exe
  
    "A Java Runtime Environment (JRE) or Java development Kit (JDK) must be available in order to run eclipse. No Java virtual machine was found after searching the following locations: "
    
    Install JDK on your system from http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
    
    If the problem persists add the path to your java VM in eclipse.ini.
    Helpful links
    
    http://stackoverflow.com/questions/2162121/eclipse-will-not-open-due-to-environment-variables
    http://wiki.eclipse.org/Eclipse.ini


2.  After opening eclipse, you might need to update your sdk tools.
    In eclipse, go to Window>Android SDK Manager and update the required tools.
    
    If your SDK manager is not able to fetch the updates list, try turning on your noproxy script OR add proxy details by going to tools>options in th SDK manager window.
    
3.  If your program shows error like R class not found. Try cleaning your project
    Project>Clean.

4.  Android Emulator takes some time to load (especially the higher android versions). Be patient and once opened, do not close it. Everytime you start your application, it'll run on that emulator.

