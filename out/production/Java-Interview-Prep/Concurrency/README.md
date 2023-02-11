# Concurrency Tutorial

* Ex1 - creates an instance of Thread
  Provide a Runnable object. The Runnable interface defines a single method, run, meant to contain the code executed in the thread. The Runnable object is passed to the Thread constructor.
* Ex2 - creates an instance of Thread
  Subclass Thread. The Thread class itself implements Runnable, though its run method does nothing. An application can subclass Thread, providing its own implementation of run, 
  as in the HelloThread example
* E