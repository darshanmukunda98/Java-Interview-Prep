# Notes

### Using Threads in Java
One is to declare a class that is a subclass of that Thread class
```
class CustomThread extends Thread {
CustomThread() { start(); }
@Overide
public void run() { } //Do the work this was created for
}

Custom thread1 - new CustomThread();
```