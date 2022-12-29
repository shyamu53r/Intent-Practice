# Intent
These are used for navigating among various activities within same application and also from one application to another application.

Intent can be of two types in android :
1. Implicit Intent
2. Explicit Intent


Applications of **Intents** :-
* Sending the user to another app
* getting a result from an Activity
* Allowing other Apps to start your activity.

## Implicit Intent
In this we don't specify the component. In such case intent provides information on available components provided by the system that is to be invoked. for exapmle you mau see the below syntax.

**Syntax:**
```
Intent intent=new Intent(Intent.ACTION_VIEW);
intent.setData(Uri.parse("https://www.geeksforgeeks.org/"));
startActivity(intent);
```


## Explicit Intent
In this we specify the component. in such a case, intent provides the external class to be invoked.

**Syntax:**
```
Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  
startActivity(i);
```
Here is the GIF of the app,

![intent_in_action](https://imgur.com/VfV8Yz9.gif)
