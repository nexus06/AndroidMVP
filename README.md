# Android boilerplate based on MVP 

Sample Android Boilerplate app as a reference for new Android projects. 
It demonstrates the architecture, tools and guidelines to be used when developing for Android platform.


Libraries and tools included:

Support libraries
RxJava and RxAndroid
Dagger 2
AutoValue with extensions AutoValueParcel and AutoValueGson
Mockito
JDK 1.8
Android SDK.
Latest Android SDK Tools and build tools.

This project follows MVP architecture guidelines.

Read more about them here: https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter

# Branches 

Each branch is pretendended as good start point for your own project depending on the complexity you want. Checkout from branches:

- Master: is the basic project exposing basic MVP interfaces. Perfect to start coding in a new project

- Dagger: Includes Dagger2 library, and initial Dagger 2 DI basic setup. 

- MVPTesting: Continues Dagger2 setup and start point for testable UNIT. Also includes more interesting libraries: Autovalue and Android java Rx


# About basic master branch.
"Think always as if you were programming an API". That is the point. 
 it describes the BASIC interfaces for the application that are
  required and provided by the layers in the Model-View-Presenter
  (MVP) pattern.  This design ensures loose coupling between the
  layers in the app's MVP-based architecture.
  
  We differenciate between "RequiredOps" and "ProvidedOps". 
  
  RequiredOps:  This interfaces defines the minimum API needed by the
     Next layer to interact with previous one layer. That is for example the minimum exposed operations that Model layer can call 
     (to presenter).
     Model -> presenter, or presenter -> view
     
  ProvidedOps: This interfaces defines the minimum public API provided by the
     next presenter to previous one layer. That is, for example the minimum exposed operations that View Layer can call to presenter.
     View -> Presenter, or presenter -> model
